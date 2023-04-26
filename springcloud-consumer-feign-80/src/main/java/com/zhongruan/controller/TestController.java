package com.zhongruan.controller;

import com.zhongruan.entity.Goods;
import com.zhongruan.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    ClientService clientService;

    @GetMapping(value = "/goods", produces = {"application/json;charset=UTF-8"})
    public List<Goods> getAll(){
        return clientService.getAllGoods();
    }


    @RequestMapping(value = "/goods/{id}", produces = {"application/json;charset=UTF-8"})
    public Goods getById(@PathVariable(value = "id") int id){
        return clientService.getById(id);
    }
}
