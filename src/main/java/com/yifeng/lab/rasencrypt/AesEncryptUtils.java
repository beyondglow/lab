package com.yifeng.lab.rasencrypt;



import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 * <p>Title: AesEncryptUtils<／p>
 * <p>Description: <／p>
 * <p>Company: YunYin<／p> 
 * @author yh
 * @date 2021年3月31日 下午2:31:21
 */
public class AesEncryptUtils {
	
	  private static final String KEY = "d7585fde114abcda";
	    private static final String ALGORITHMSTR = "AES/CBC/NoPadding";

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
	    

	    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
	        KeyGenerator kgen = KeyGenerator.getInstance("AES");
	        kgen.init(128);
	        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
//	        IvParameterSpec ips = new IvParameterSpec(base64Ecode(content));
	        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
	        return cipher.doFinal(content.getBytes("utf-8"));
	    }

	    public static String aesEncrypt(String content, String encryptKey) throws Exception {
	        return base64Encode(aesEncryptToBytes(content, encryptKey));
	    }

	    public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
	        KeyGenerator kgen = KeyGenerator.getInstance("AES");
	        kgen.init(128);
	        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
	        IvParameterSpec ips = new IvParameterSpec(encryptBytes);
	        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"), ips);
	        byte[] decryptBytes = cipher.doFinal(encryptBytes);
	        return new String(decryptBytes);
	    }

	    public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
	        return aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
	    }

	    public static void main(String[] args) throws Exception {
	        String content = "1231231111112227";
	        System.out.println("加密前：" + content);

	        String encrypt = aesEncrypt(content, KEY);
	        System.out.println(encrypt.length() + ":加密后：" + encrypt);

	        String decrypt = aesDecrypt("QxVrVsfbW7SW1jRWX+RtbQ==", "d7585fde114abcda");
	        																																								
	        System.out.println("解密后：" + decrypt);
	    }
}

	
