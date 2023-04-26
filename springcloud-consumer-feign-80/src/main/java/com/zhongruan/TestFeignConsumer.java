package com.zhongruan;

import com.myrule.CjlRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zhongruan"})
@RibbonClient(name = "SPRINGCLOUD-PROVIDER", configuration = CjlRule.class)
public class TestFeignConsumer {

    public static void main(String[] args) {
        SpringApplication.run(TestFeignConsumer.class, args);
    }
}
