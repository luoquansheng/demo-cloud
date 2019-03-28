package com.lqs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Ro on 2019/3/28.
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka1 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka1.class, args);
    }
}
