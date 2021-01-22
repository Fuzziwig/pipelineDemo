package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //index mapping
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
