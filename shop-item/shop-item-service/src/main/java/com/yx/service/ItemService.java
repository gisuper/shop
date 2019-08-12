package com.yx.service;

import com.yx.item.pojo.Item;

import org.springframework.stereotype.Service;

/**
 * Created by yangxiong on 2019/8/12.
 */
@Service
public class ItemService {

    public Item addItem(Item item){

        return new Item(1,"jack");
    }
}
