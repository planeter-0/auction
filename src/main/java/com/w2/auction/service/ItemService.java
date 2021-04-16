package com.w2.auction.service;

public interface ItemService {
    void getAll();
    void getOne(Long itemId);
    void getTaggedAll();
    void search(String name);
    void uploadItem();
    void getMine();
}
