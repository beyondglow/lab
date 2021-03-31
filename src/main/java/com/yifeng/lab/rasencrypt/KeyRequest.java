package com.yifeng.lab.rasencrypt;

import javax.validation.constraints.NotNull;

/**
 * <p>Title: KeyRequest<／p>
 * <p>Description: <／p>
 * <p>Company: YunYin<／p> 
 * @author yh
 * @date 2021年3月31日 下午2:46:32
 */

/**
 * 私钥输入参数（其实就是客户端通过服务端返回的公钥加密后的客户端自己生成的公钥）
 */
public class KeyRequest {
	 /**
     * 客户端自己生成的加密后公钥
     */
    @NotNull
    private String clientEncryptPublicKey;

    public String getClientEncryptPublicKey() {
        return clientEncryptPublicKey;
    }

    public void setClientEncryptPublicKey(String clientEncryptPublicKey) {
        this.clientEncryptPublicKey = clientEncryptPublicKey;
    }
}
