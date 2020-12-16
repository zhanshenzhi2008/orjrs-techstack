package com.orjrs.techstack.login.controller;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("login")
public class LoginController {

    @GetMapping("/user/sayHello")
    public String sayHello(String a){
        return "Welcome to orjrs techstack";
    }
}
