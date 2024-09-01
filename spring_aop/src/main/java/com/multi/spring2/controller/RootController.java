package com.multi.spring2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
 public class RootController {

    public RootController(){
        System.out.println("RootController created");
    }

    @GetMapping("/")
    public String root(){
        return "index";
    }
}