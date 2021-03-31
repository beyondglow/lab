package com.yifeng.lab.ec;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;



/**
 * 非对称加密
 * @author yh
 *
 */
public class CipherAsymmetric {
	
	//加密算法
	public static final String ALGORITHM = "DES";
	public static final String IV = "11620018";
	public static final String KEY="yunxinhuimei";
	
	/**
	 * (1)加密算法有：AES，DES，DESede(DES3)和RSA 四种
	 * (2) 模式有CBC(有向量模式)和ECB(无向量模式)，向量模式可以简单理解为偏移量，使用CBC模式需要定义一个IvParameterSpec对象
	 * (3) 填充模式:
	 * NoPadding: 加密内容不足8位用0补足8位, Cipher类不提供补位功能，需自己实现代码给加密内容添加0, 如{65,65,65,0,0,0,0,0}
	 * PKCS5Padding: 加密内容不足8位用余位数补足8位, 如{65,65,65,5,5,5,5,5}或{97,97,97,97,97,97,2,2}; 刚好8位补8位8
	 */

	/**
	 * 加密
	 * @param content 加密内容
	 * @param slatKey 加密盐，16为字符串
	 * @param vectorKey 机密的定向，16为字符串
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String content) throws Exception {
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");//参数按"算法/模式/填充模式"
//		SecretKey secretKey = new SecretKeySpec(slatKey.getBytes(), "AES");
		SecretKey secretKey = (SecretKey)toKey();
		IvParameterSpec iv = new IvParameterSpec(IV.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
		return Base64.getEncoder().encodeToString(cipher.doFinal(content.getBytes()));
	}
	
	/**
	 * 解密
	 * @param base64Content 解密内容（base64编码）
	 * @param saltKey 加密是使用的盐，16位字符串
	 * @param vectoryKey 加密时使用的定向，16为字符串
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String content) throws Exception {
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
//		SecretKey secretKey = new SecretKeySpec(saltKey.getBytes(), "AES");
		SecretKey secretKey = (SecretKey)toKey();
		IvParameterSpec iv = new IvParameterSpec(IV.getBytes());
		// 用密钥初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
		return new String(cipher.doFinal(Base64.getDecoder().decode(content.getBytes())));
	}
	

    
    public static Key toKey() throws Exception {
        DESKeySpec desKey = new DESKeySpec(KEY.getBytes());
        SecretKeyFactory factory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey secretKey  = factory.generateSecret(desKey);
        return secretKey;
    }
	
	public static void main(String[] args) throws Exception {
		String encryptStr = encrypt("a=123&b=456");
		System.out.println("加密内容"+encryptStr);
		String decryptStr = decrypt("RsuU3PB3aPuk3wDmtLPQTw==");
		System.out.println("解密内容:" + decryptStr);
	}
	
}
