package com.example.eurekam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekamApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekamApplication.class, args);
    }

}
