package com.kpwang.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author kpwang
 * @create 2019-08-2019/8/20-23:03
 */
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示信息
    private String message;
    //具体内容
    private T data;
}
