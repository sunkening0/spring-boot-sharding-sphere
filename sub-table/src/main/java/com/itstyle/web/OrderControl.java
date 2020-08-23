package com.itstyle.web;

import com.itstyle.entity.OrderEntity;
import com.itstyle.repository.OrderRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags ="订单管理")
@RestController
@RequestMapping("/sys/order")
public class OrderControl {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 插入
     */
    @RequestMapping("/save")
    public void save(){
        for(int i=0;i<10;i++){
            OrderEntity entity = new OrderEntity();
            entity.setUserId(2);
            orderRepository.save(entity);
        }
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public void list(){
        List<OrderEntity> list = orderRepository.findAll();
        System.out.println(list.size());
    }
}
