package com.w2.auction.repositoey;


import com.w2.auction.pojo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
