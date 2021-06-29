package com.cainiao.myproject01.controller;

import com.cainiao.myproject01.bean.User;
import com.cainiao.myproject01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginIn")
    public String loginIn(String name,String password) {
        User user = userService.checkUser(name,password);
        if(user == null) {
            return "error";
        }else {
            return "success";
        }
    }
}
