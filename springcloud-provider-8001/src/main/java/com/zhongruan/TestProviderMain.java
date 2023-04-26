package com.zhongruan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(TestProviderMain.class, args);
    }

}
