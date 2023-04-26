package com.zhongruan;

import com.myrule.CjlRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER", configuration = CjlRule.class)
public class TestConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(TestConsumer80.class, args);
    }
}
