package com.boot.demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String helloworld() {
        return "helloworld";
    }


    @GetMapping("/world")
    public String helloTest() {
        return "HELLO订单的收拾";
    }

    @RequestMapping("/post")
    public String helloTest(String ids) {
        logger.info("sssssss-----{}", ids);

        String[] str = ids.split(",");

        return "HELLO订单的收拾" + str.toString();
    }

}
