package com.yx.controller;

import com.yx.common.enums.ExceptionEnums;
import com.yx.common.exception.ShopException;
import com.yx.item.pojo.Item;
import com.yx.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangxiong on 2019/8/12.
 */
@RestController("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> addItem(Item item) {

        if (item.getId() < 0){
           throw new ShopException(ExceptionEnums.SHOP_BAD_REQUEST);
        }
        Item itemResult = itemService.addItem(item);
        return ResponseEntity.ok(itemResult);
    }
}
