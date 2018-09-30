package com.bootweb.webs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tlf")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }
}
