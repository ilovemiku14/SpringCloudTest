package com.zhongruan.controller;

import com.zhongruan.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/goods", produces = {"application/json;charset=UTF-8"})
    public List<Goods> getAll(){
        return restTemplate.getForObject(
                "http://SPRINGCLOUD-PROVIDER/goods", List.class);
    }

    @GetMapping(value = "/goods/{id}", produces = {"application/json;charset=UTF-8"})
    public Goods getById(@PathVariable int id){
        return restTemplate.getForObject("http://SPRINGCLOUD-PROVIDER/goods/"+id, Goods.class);
    }
}
