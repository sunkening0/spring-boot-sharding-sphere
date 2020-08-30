package com.itstyle.web;

import com.itstyle.common.Result;
import com.itstyle.entity.OrderEntity;
import com.itstyle.repository.OrderRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags ="订单管理")
@RestController
@RequestMapping("/order")
public class OrderControl {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 插入
     */
    @PostMapping("/save")
    public void save(){
        for(int i=0;i<10;i++){
            OrderEntity entity = new OrderEntity();
            entity.setUserId(i);
            entity.setGoodsId(1000L);
            entity.setPayStatus((short)0);
            orderRepository.save(entity);
        }
    }

    /**
     * 列表
     */
    @PostMapping("/list")
    public Result list(){
        List<OrderEntity> list = orderRepository.findAll();
        return Result.ok(list);
    }
}
