package com.w2.auction.repositoey;


import com.w2.auction.pojo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
