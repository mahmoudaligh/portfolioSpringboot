package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class homeContraller {

    @GetMapping("/")
    public String getIndex(){
        return "index.html";
    }
}
