package com.zhongruan.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhongruan.entity.Goods;
import com.zhongruan.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/goods")
    @HystrixCommand
    public List<Goods> getAll(){
        return goodsService.getAllGoods();
    }

    @GetMapping("/goods/{id}")
    @HystrixCommand(fallbackMethod = "getHystrixGoods")
    public Goods getById(@PathVariable int id){
        Goods goods = goodsService.getById(id);
        if(goods == null){
            throw new RuntimeException("商品不存在");
        }
        return goods;
    }

    public Goods getHystrixGoods(@PathVariable int id){
        Goods goods = new Goods();
        goods.setName("商品不存在");
        return goods;
    }
}
