package com.w2.auction.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "image")
public class Image implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    // 0 -> 用户头像, 1 -> 商品图片
    private Integer type;
    private Date upload;
    private Date updated;
}
