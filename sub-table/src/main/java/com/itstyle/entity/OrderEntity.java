package com.itstyle.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_order")
public final class OrderEntity{

    private static final long serialVersionUID = 4743102234543827854L;

    /**
     * 订单ID
     */
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    /**
     * 商品ID
     */
    @Column(name = "goods_id")
    private long goodsId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private int userId;

    /**
     * 支付状态 1 支付完成 0 支付中
     */
    @Column(name = "pay_status")
    private short payStatus;

}
