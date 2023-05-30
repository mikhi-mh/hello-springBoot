package com.example.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("msg")
    public String msg(){
        return "Hello I am from the controller class";
    }
    //    localhost:8080/hello/msg
}
