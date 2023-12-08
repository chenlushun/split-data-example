package com.chenlushun.split.data.example;

import com.chenlushun.split.data.example.entity.Order;
import com.chenlushun.split.data.example.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/createOrder")
    public Boolean createOrder() {
        Order order = new Order();
        order.setOrderNo(String.valueOf(new Random().nextInt(100)));
        order.setUserName("zhangsan");
        orderMapper.insertOrder(order);
        return true;
    }
}
