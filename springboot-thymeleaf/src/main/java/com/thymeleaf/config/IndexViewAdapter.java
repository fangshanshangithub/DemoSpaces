package com.thymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


//@Configuration
public class IndexViewAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 这是直接指向static静态目录下的index.html文件
        registry.addViewController("/").setViewName("index.html");
        super.addViewControllers(registry);
    }


}
