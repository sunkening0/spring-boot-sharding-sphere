package com.itstyle.repository;

import com.itstyle.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 订单
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}

