package com.boot.demo1.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("envirment")
public class EnvironmentController {

    @Autowired
    private Environment env;

    @RequestMapping("/info")
    public Object getEnvironmentInfo() {
        String info = "";

        info = env.getProperty("spring.profiles.active");
        return info;
    }

}
