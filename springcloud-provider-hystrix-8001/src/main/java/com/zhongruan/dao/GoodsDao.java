package com.zhongruan.dao;

import com.zhongruan.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsDao {

    @Select("select * from goods")
    public List<Goods> getAllGoods();

    @Select("select * from goods where id = #{id}")
    public Goods getById(@Param("id") int id);
}
