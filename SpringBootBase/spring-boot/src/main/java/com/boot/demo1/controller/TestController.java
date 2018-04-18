package com.boot.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String helloworld() {
        return "helloworld";
    }


    @GetMapping("/world")
    public String helloTest() {
        return "HELLO-TE订单sss的收拾";
    }

}
