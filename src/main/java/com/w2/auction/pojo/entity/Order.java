package com.w2.auction.pojo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seller_id")
    private Long sellerId; //卖家

    @Column(name = "buyer_id")
    private Long buyerId; //买家

    @Column(name = "address_id")
    private Long addressId; //地址

    private boolean complete;
}
