package com.team.est;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EstApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstApiApplication.class, args);
    }

}
