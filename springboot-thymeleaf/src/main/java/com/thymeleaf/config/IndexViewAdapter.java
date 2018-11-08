package com.thymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


/**
 * extends WebMvcConfigurationSupport
 */
@Configuration
public class IndexViewAdapter extends WebMvcConfigurationSupport{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index");
    }
}


/**
 * implements WebMvcConfigurer
 */
/*@Configuration
public class IndexViewAdapter implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index");
    }
}*/



/**
 * WebMvcConfigurerAdapter springboot2 之后过期，
 * 2种方式替换
 *      implements WebMvcConfigurer
 *      extends WebMvcConfigurationSupport
 */
/*
@Configuration
public class IndexViewAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //1。 这种方式 是将http://localhost:8080/ 指向到http://localhost:8080/index 请求中【是controller】
        //registry.addViewController("/").setViewName("forward:/index");

        //2。 这种写法不可以，应为index2.html是一个静态资源【static目录下】，setViewName()方法接收的只能是SpringMVC的ViewName【ModelAndView】
        //registry.addViewController("/").setViewName("index2.html");

        //3。如果一定要指向一个静态页面 ： (1).取消当前IndexViewAdapter 配置类，在static目录下放index.html页面；(2).拦截器实现
        super.addViewControllers(registry);
    }
}
*/
