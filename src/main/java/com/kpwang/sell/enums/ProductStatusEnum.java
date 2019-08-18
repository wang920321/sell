package com.kpwang.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author kpwang
 * @create 2019-08-2019/8/15-23:39
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }

}
