package com.yifeng.lab;

/**
 * 封装API的错误码
 *
 * @author YH
 * @date 2020/3/30
 */
public interface IErrorCode {
    /**
     * 获取错误码
     * @return 错误码
     */
    long getCode();

    /**
     * 获取错误码对应信息
     * @return 信息
     */
    String getMessage();
}
