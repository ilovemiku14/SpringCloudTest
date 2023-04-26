package com.zhongruan.service;

import com.zhongruan.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER", fallbackFactory = GoodsClientServiceFallBackFactory.class)
public interface ClientService {
    @GetMapping("/goods")
    public List<Goods> getAllGoods();

    @RequestMapping("/goods/{id}")
    public Goods getById(@PathVariable(value = "id") int id);
}
