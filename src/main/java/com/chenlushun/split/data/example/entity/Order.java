package com.chenlushun.split.data.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("order")
public class Order {
    private Long id;
    private String orderNo;
    private String userName;
    private Date createTime;
    private Date modifyTime;
}
