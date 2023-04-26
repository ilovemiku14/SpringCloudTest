package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CjlRule {
//    @Bean    //随机策略
    public IRule getRandomRule(){
        return new RandomRule();
    }

    //每一个服务访问5次，然后切换到下一个服务

    @Bean
    public IRule getMyRoundRule(){
        return new MyRoundRule();
    }
}
