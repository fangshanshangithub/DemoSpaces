package com.bootweb.webs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootWebsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebsApplication.class, args);
    }
}
