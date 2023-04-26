package com.zhongruan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(TestConfigServerApp.class, args);
    }

}
