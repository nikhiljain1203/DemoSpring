package com.example.demospringapplication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {
    @GetMapping("/world")
    public String printHello() {
        return "HELLO WORLD";
    }
}
