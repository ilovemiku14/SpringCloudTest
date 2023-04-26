package com.zhongruan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //该服务接收注册
public class TestEureka7002 {

    public static void main(String[] args) {
        SpringApplication.run(TestEureka7002.class, args);
    }

}
