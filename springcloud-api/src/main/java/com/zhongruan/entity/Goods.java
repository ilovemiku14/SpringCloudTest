package com.zhongruan.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@Data //添加set和get方法
//@NoArgsConstructor  //添加不带参的构造
//@Accessors(chain = true)
public class Goods implements Serializable {
    private int id;
    private String name;
    private float price;
    private String source;

//    public Goods(String name, float price) {
//        this.name = name;
//        this.price = price;
//
//    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
