package com.yifeng.lab.rasencrypt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yifeng.lab.CommonResult;
import com.yifeng.lab.rasencrypt.KeyRequest;
import com.yifeng.lab.rasencrypt.KeyResponse;
import com.yifeng.lab.rasencrypt.RSAResponse;
import com.yifeng.lab.rasencrypt.service.EncryptOpenService;

/**
 * <p>Title: rasDemoController<／p>
 * <p>Description: <／p>
 * <p>Company: YunYin<／p> 
 * @author yh
 * @date 2021年3月31日 下午2:28:13
 */


@RestController
@RequestMapping("open/encrypt")
public class EncryptController {

    @Autowired
    private EncryptOpenService encryptOpenService;

    @RequestMapping(value = "getRSA",method = RequestMethod.POST)
    //@DisabledEncrypt
    public CommonResult<RSAResponse> getRSA(){
        return encryptOpenService.getRSA();
    }

    @RequestMapping(value = "getKey",method = RequestMethod.POST)
    //@DisabledEncrypt
    public CommonResult<KeyResponse> getKey(@Valid @RequestBody KeyRequest request)throws Exception{
        return encryptOpenService.getKey(request);
    }
}
