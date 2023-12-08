package com.chenlushun.split.data.example.mapper;

import com.chenlushun.split.data.example.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    int insertOrder(@Param("order") Order order);
}
