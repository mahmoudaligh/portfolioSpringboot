package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class homeContraller {

    @GetMapping("/")
    public String getIndex(){
        return "index.html";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login.html";
    }

    @GetMapping("/register")
    public String getRegister(){
        return "register.html";
    }
    @GetMapping("/base")
    public String getBase(){
        return "base.html";
    }
}
