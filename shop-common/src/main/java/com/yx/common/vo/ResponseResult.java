package com.yx.common.vo;

import com.yx.common.enums.ExceptionEnums;

import java.util.Date;

import lombok.Getter;

/**
 * Created by yangxiong on 2019/8/12.
 */
@Getter
public class ResponseResult {
    private int code;
    private String msg;
    private String time;

    public ResponseResult(ExceptionEnums exceptionEnums) {
        this.code = exceptionEnums.getCode();
        this.msg = exceptionEnums.getMsg();
        time=new Date().toLocaleString();
    }
}
