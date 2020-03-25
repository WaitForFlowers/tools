package com.sky.tools.utils;

import java.io.Serializable;

/**
 * @author author
 * @date 2020/3/11 - 20:15
 */
public class HttpClientResult implements Serializable {
    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;

    public HttpClientResult(int code, String content){
        this.code=code;
        this.content=content;
    }
    public HttpClientResult(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
