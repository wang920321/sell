package com.kpwang.sell.enums;

import lombok.Getter;

/**
 * @author kpwang
 * @create 2019-08-2019/8/28-23:17
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新下单"),
    FINISH(1,"完成"),
    CANCEL(2,"取消");
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
