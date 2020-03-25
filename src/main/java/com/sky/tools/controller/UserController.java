package com.sky.tools.controller;

import com.sky.tools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:
 * @description:
 * @author: zwh
 * @create: 2020/3/20 11:07
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/find")
    public String findId(){
        String id = "1";
        String name = userService.findId(id);
        return name;
    }
}
