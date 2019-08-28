package com.kpwang.sell.enums;

import lombok.Getter;

/**
 * @author kpwang
 * @create 2019-08-2019/8/28-23:21
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"新下单"),
    SUCCESS(1,"完成");
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
