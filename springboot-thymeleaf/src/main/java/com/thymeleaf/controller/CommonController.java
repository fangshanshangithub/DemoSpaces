package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("index")
    public String index() {
        System.out.println("CommonController.index");
        return "index";
    }

}
