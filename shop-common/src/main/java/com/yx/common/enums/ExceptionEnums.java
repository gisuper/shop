package com.yx.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * Created by yangxiong on 2019/8/12.
 */

@Getter
@AllArgsConstructor
public enum ExceptionEnums {

    SHOP_BAD_REQUEST(400, "参数错误");

    private int code;
    private String msg;

}