package com.zhongruan.controller;

import com.zhongruan.entity.Goods;
import com.zhongruan.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/goods")
    public List<Goods> getAll(){
        return goodsService.getAllGoods();
    }
}
