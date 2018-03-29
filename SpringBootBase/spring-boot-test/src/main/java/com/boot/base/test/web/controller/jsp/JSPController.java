package com.boot.base.test.web.controller.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/jsp")
public class JSPController {

    @RequestMapping("/index")
    public String login(){
        return "index";
    }
}