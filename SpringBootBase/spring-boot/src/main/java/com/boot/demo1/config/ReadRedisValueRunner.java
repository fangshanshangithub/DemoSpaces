package com.boot.demo1.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 在 项目启动时执行的预处理逻辑业务【缓存加载，页面缓存等等】.
 * @Order 注解的执行优先级是按value值从小到大顺序
 */
@Component
public class ReadRedisValueRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("<========== 项目启动处理 预加载的项目功能 =============>");
    }
}