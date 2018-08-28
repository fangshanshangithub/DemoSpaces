package com.example.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@MapperScan(basePackages = {"snapshot.dao"}, sqlSessionFactoryRef = "sqlSessionFactory") //mybatis 注解配置
public class SpringBootApplicationStartUp {
    public static void main(String[] args){
        /* 配置文件的读取方式*/
        //ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplicationDemo.class, args);
        //context.getBean(WebConfig.class).show();

        //context.getBean(DataSourceProperties.class).show();

        //Spring Boot 启动方式一
        SpringApplication.run(SpringBootApplicationStartUp.class);

        // 启动方式二
        //SpringApplication springApplication = new SpringApplication(SpringBootApplicationDemo.class);
        //springApplication.setBannerMode(Banner.Mode.OFF); // 控制banner的开启关闭--默认开启
        //springApplication.run(args);
    }
}
