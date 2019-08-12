package com.yx.common.exception;

import com.yx.common.enums.ExceptionEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by yangxiong on 2019/8/12.
 */
@AllArgsConstructor
@Getter
public class ShopException extends RuntimeException {

    private ExceptionEnums exceptionEnums;

}