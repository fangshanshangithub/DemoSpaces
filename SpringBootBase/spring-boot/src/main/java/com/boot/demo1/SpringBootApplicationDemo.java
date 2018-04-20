package com.boot.demo1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootApplicationDemo{
    public static void main(String[] args){
        //Spring Boot 启动方式一
        //SpringApplication.run(SpringBootApplicationDemo.class);

        // 启动方式二
        SpringApplication springApplication = new SpringApplication(SpringBootApplicationDemo.class);
        //springApplication.setBannerMode(Banner.Mode.OFF); // 控制banner的开启关闭--默认开启
        springApplication.run(args);
    }
}
