package com.w2.auction.repositoey;


import com.w2.auction.pojo.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Integer> {
}
