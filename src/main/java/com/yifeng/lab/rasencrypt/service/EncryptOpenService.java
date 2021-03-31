package com.yifeng.lab.rasencrypt.service;

import com.yifeng.lab.CommonResult;
import com.yifeng.lab.rasencrypt.KeyRequest;
import com.yifeng.lab.rasencrypt.KeyResponse;
import com.yifeng.lab.rasencrypt.RSAResponse;

/**
 * <p>Title: EncryptOpenService<／p>
 * <p>Description: <／p>
 * <p>Company: YunYin<／p> 
 * @author yh
 * @date 2021年3月31日 下午2:41:43
 */
public interface EncryptOpenService {
	
	 /**
     * 生成RSA公私钥
     * @return
     */
	CommonResult<RSAResponse> getRSA();

    /**
     * 获得加解密用的密钥
     * @param request
     * @return
     */
	CommonResult<KeyResponse> getKey(KeyRequest request) throws Exception;
}
