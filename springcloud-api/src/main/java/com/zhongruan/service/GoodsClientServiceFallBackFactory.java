package com.zhongruan.service;

import com.zhongruan.entity.Goods;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GoodsClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new ClientService() {
            @Override
            public List<Goods> getAllGoods() {
                List<Goods> goodsList = new ArrayList<>();
                Goods e = new Goods();
                e.setName("服务降级，商品列表为空");
                goodsList.add(e);
                return goodsList;
            }

            @Override
            public Goods getById(int id) {
                Goods goods = new Goods();
                goods.setName("服务降级，商品为空");
                return goods;
            }
        };
    }
}
