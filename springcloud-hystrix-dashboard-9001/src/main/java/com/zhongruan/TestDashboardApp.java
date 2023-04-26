package com.zhongruan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class TestDashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(TestDashboardApp.class, args);
    }
}
