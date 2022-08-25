package com.team.est;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.team.est.mapper")
public class EstProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstProviderApplication.class, args);
    }

}
