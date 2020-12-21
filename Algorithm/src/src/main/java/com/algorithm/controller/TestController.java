package com.algorithm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String helloWorld(){

        return "HI";
    }
}
