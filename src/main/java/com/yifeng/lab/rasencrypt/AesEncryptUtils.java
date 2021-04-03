package com.yifeng.lab.rasencrypt;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;



/**
 * AES对称加密
 * 
 * @author yh
 * @date 2021年3月31日 下午2:31:21
 */
public class AesEncryptUtils {

	//算法名
	public static final String KEY_NAME = "AES";
	private static final String KEY = "d7585fde114abcda";
	// 加解密算法/模式/填充方式
	// ECB模式只用密钥即可对数据进行加密解密，CBC模式需要添加一个iv
	private static final String ALGORITHMSTR = "AES/CBC/PKCS5Padding";

	public static String base64Encode(byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}

	public static byte[] base64Decode(String base64Code) throws Exception {
		return Base64.decodeBase64(base64Code);
	}

	public static byte[] base64Ecode(String content) throws Exception {
		byte[] contentBytes = content.getBytes("utf-8");
		return Base64.encodeBase64(contentBytes);
	}
	
	/**
     * 初始化密钥
     */
    public static void init() throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        KeyGenerator.getInstance(KEY_NAME).init(128);
    }

	/**
	 * 生成iv
	 */
	public static AlgorithmParameters generateIV(byte[] iv) throws Exception {
		AlgorithmParameters params = AlgorithmParameters.getInstance(KEY_NAME);
		params.init(new IvParameterSpec(iv));
		return params;
	}

	public static byte[] aesEncryptToBytes(String content, String encryptKey, AlgorithmParameters iv) throws Exception {
		Security.addProvider(new BouncyCastleProvider());
        KeyGenerator.getInstance(KEY_NAME).init(128);
		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), KEY_NAME), iv);
		return cipher.doFinal(content.getBytes("utf-8"));
	}

	public static String aesEncrypt(String content, String encryptKey, String iv) throws Exception {
		byte[] iv64 = base64Decode(iv);
		return base64Encode(aesEncryptToBytes(content, encryptKey, generateIV(iv64)));
	}

	public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey, AlgorithmParameters iv) throws Exception {
		//初始化密钥
		Security.addProvider(new BouncyCastleProvider());
        KeyGenerator.getInstance(KEY_NAME).init(128);
		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), KEY_NAME), iv);
		byte[] decryptBytes = cipher.doFinal(encryptBytes);
		return new String(decryptBytes);
	}

	public static String aesDecrypt(String encryptStr, String decryptKey, String iv) throws Exception {
		byte[] iv64 = base64Decode(iv);
		return aesDecryptByBytes(base64Decode(encryptStr), decryptKey, generateIV(iv64));
	}

	 public static byte[] AES_CBC_Encrypt(byte[] content, byte[] keyBytes, byte[] iv){
			
			return AES_CBC(content, keyBytes, iv, Cipher.ENCRYPT_MODE);
		}
		
		public static byte[] AES_CBC_Decrypt(byte[] content, byte[] keyBytes, byte[] iv){
			return AES_CBC(content, keyBytes, iv, Cipher.DECRYPT_MODE);
		}
		
		public static byte[] AES_CBC(byte[] content, byte[] keyBytes, byte[] iv, int opmode){ 
			try{
				KeyGenerator keyGenerator=KeyGenerator.getInstance(KEY_NAME);
				keyGenerator.init(128, new SecureRandom(keyBytes));//key长可设为128，192，256位，这里只能设为128
				SecretKey key=keyGenerator.generateKey();
				Cipher cipher=Cipher.getInstance(ALGORITHMSTR);
				cipher.init(opmode, key, new IvParameterSpec(iv));
				byte[] result=cipher.doFinal(content);
				return result;
			}catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("exception:"+e.toString());
			} 
			return null;
		}
		
			
		public static String byteToHexString(byte[] bytes) {
	        StringBuffer sb = new StringBuffer(bytes.length);
	        String sTemp;
	        for (int i = 0; i < bytes.length; i++) {
	            sTemp = Integer.toHexString(0xFF & bytes[i]);
	            if (sTemp.length() < 2)
	                sb.append(0);
	            sb.append(sTemp.toUpperCase());
	        }
	        return sb.toString();
	    }
		
		public static byte[] parseStr(String hexString){
			String hex ="0123456789ABCDEF";       
			if (hexString == null || hexString.equals("")) {  
		        return null;  
		    }  
		    hexString = hexString.toUpperCase();  
		    int length = hexString.length() / 2;  
		    char[] hexChars = hexString.toCharArray();  
		    byte[] d = new byte[length];  
		    for (int i = 0; i < length; i++) {  
		        int pos = i * 2;  
		        d[i] = (byte) (hex.indexOf((hexChars[pos])) << 4 | hex.indexOf((hexChars[pos + 1])));  
		    }  
		    return d;  
		}

	    
	    public static void main(String[] args) {  
	    	String content="{\"xxx\":[{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"}],\"xxx\":[{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"}],\"xxx\":[{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"},{\"xxx\": \"09890\"}]}";
			String key="aaaaaaaa";
			String iv="abcdefghijklmnop";
			
			System.out.println("加密前："+byteToHexString(content.getBytes()) + "内容是："+content);
			byte[ ] encrypted=AES_CBC_Encrypt(content.getBytes(), key.getBytes(), iv.getBytes());
			System.out.println("加密后："+byteToHexString(encrypted));
			byte[ ] decrypted=AES_CBC_Decrypt(encrypted, key.getBytes(), iv.getBytes());
			
			String hexStr = byteToHexString(decrypted);
			byte[] ps = parseStr(hexStr);
			String xx = new String(ps);

			System.out.println("解密后："+byteToHexString(decrypted) + "内容是：" + xx);

	    }  
}
