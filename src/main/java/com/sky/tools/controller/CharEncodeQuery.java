package com.sky.tools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @program:
 * @description:
 * @author: zwh
 * @create: 2020/3/20 13:32
 */
@RestController("")
public class CharEncodeQuery {
//    通过穷举法判断出乱码的字符的编码格式
    @GetMapping("/CharEncode")
    public String charEncodeQuery(String str) throws UnsupportedEncodingException {
        str="你好";
        System.out.println(new String (str.getBytes("UTF-8"),"UTF-8"));
        System.out.println(new String (str.getBytes("GBK"),"UTF-8"));
        System.out.println(new String (str.getBytes("iso-8859-1"),"UTF-8"));
        return null;
    }
}
