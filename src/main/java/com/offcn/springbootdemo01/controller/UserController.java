package com.offcn.springbootdemo01.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.springbootdemo01.pojo.User;
import com.offcn.springbootdemo01.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Reference(timeout = 4000)
    UserService userService;

//阿萨飒飒飒飒
    //打算的撒大多所

//13221323213123

    @GetMapping("/test1")
    public List<User> test1(){
        List<User> all = userService.getAll();
        return all;
    }

}
