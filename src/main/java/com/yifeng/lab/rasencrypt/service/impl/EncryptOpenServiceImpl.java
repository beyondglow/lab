package com.yifeng.lab.rasencrypt.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yifeng.lab.CommonResult;
import com.yifeng.lab.rasencrypt.KeyRequest;
import com.yifeng.lab.rasencrypt.KeyResponse;
import com.yifeng.lab.rasencrypt.RSAResponse;
import com.yifeng.lab.rasencrypt.RSAUtils;
import com.yifeng.lab.rasencrypt.service.EncryptOpenService;

/**
 * <p>Title: EncryptOpenServiceImpl<／p>
 * <p>Description: <／p>
 * <p>Company: YunYin<／p> 
 * @author yh
 * @date 2021年3月31日 下午2:42:11
 */
@Service
public class EncryptOpenServiceImpl implements EncryptOpenService{

	@Value("${rsa.publicKey}")
	private String publicKey;
	@Value("${rsa.privateKey}")
	private String privateKey;
	@Value("${api.encrypt.key}")
	private String key;
	
	@Override
	public CommonResult<RSAResponse> getRSA() {
	    RSAResponse response = RSAResponse.options()
	            .setServerPublicKey(publicKey)
	            .build();
	    return CommonResult.success(response);
	}
	
	@Override
	public CommonResult<KeyResponse> getKey(KeyRequest request)throws Exception {
	    String clientPublicKey = RSAUtils.privateDecrypt(request.getClientEncryptPublicKey(), RSAUtils.getPrivateKey(privateKey));
	    String encryptKey = RSAUtils.publicEncrypt(key,RSAUtils.getPublicKey(clientPublicKey));
	    KeyResponse response = KeyResponse.options()
	            .setKey(encryptKey)
	            .build();
	    return CommonResult.success(response);
	}
}
