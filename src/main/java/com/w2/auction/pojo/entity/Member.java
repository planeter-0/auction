package com.w2.auction.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name ="member")
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    //帐号启用状态:0->禁用；1->启用
    private Integer status;

    //注册时间
    private Date createTime;

    //性别：0->未知；1->男；2->女")
    private Integer gender;

    //生日")
    private Date birthday;

}
