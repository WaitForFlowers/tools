package com.sky.tools.service;

import com.sky.tools.dao.UserMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:
 * @description:
 * @author: zwh
 * @create: 2020/3/20 11:08
 */
@Service
public class UserService {
    @Autowired
    UserMapping userMapping;
    public String findId(String id){
        String name = userMapping.findId(id);
        System.out.println("service");
        return name;
    }
}
