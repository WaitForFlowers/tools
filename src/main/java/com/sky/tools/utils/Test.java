package com.sky.tools.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author author
 * @date 2020/2/29 - 17:59
 */
@RestController
public class Test {
    @GetMapping("/hello")
    public String saidHello(HttpServletRequest request, HttpServletResponse response){
        return "nihao";
    }
    @PostMapping("/login")
    public String login(String code, HttpSession session) {
        String appid="wx219d8dc0b83f0248";
        String secret="de52fac6c6cbea3bff95e19a5d7643bb";
        System.out.println(code);
//        String requestUrl="https://api.weixin.qq.com/sns/jscode2session?" +
//                "appid="+appid+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code";
        String requestUrl="https://api.weixin.qq.com/sns/jscode2session";
        //url参数的拼接
        HashMap<String, String> paramMap = new HashMap<>();
        paramMap.put("appid",appid);
        paramMap.put("secret",secret);
        paramMap.put("js_code",code);
        paramMap.put("grant_type","authorization_code");
        try {
            //返回值httpClientResult包含
            HttpClientResult httpClientResult = HttpClientUtils.doGet(requestUrl,paramMap);
            System.out.println(httpClientResult.getCode());
            System.out.println(httpClientResult.getContent());
            Map<String, String> maps = (Map)JSON.parse(httpClientResult.getContent());
            System.out.println("openid"+maps.get("openid")+"---session_key"+maps.get("session_key"));
            session.setAttribute(maps.get("openid"),maps.get(session.getId()));
            //拼接json串
            return "{\"openid\":\""+maps.get("openid")+"\"}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
