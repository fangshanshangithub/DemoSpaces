package com.boot.demo1.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfiguration {

    @Bean
    @Profile("dev")
    public Runnable dev(){
        System.out.println("开发环境使用的Bean");
        return () ->{};
    }

    @Bean
    @Profile("prod")
    public Runnable prod(){
        System.out.println("正式环境使用的Bean");
        return () ->{};
    }

    @Bean
    @Profile("test")
    public Runnable test(){
        System.out.println("测试环境使用的Bean");
        return () ->{};
    }
}
