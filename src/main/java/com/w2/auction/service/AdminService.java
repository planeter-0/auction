package com.w2.auction.service;

import com.w2.auction.manager.pojo.Item;
import com.w2.auction.manager.pojo.Member;

public interface AdminService {
    //审核商品，合格的才能在买家端展示，不合格的删掉（假删除，要留下作案证据，
    //并通知卖家）
    boolean verify(Item item, boolean verified);
    void deleteAccount(Member member);
}
