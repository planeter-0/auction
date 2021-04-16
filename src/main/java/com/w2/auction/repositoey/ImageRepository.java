package com.w2.auction.repositoey;


import com.w2.auction.pojo.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
