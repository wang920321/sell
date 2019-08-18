package com.kpwang.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-23:15
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;
    //名字
    private String productName;
    //单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //小图
    private String productIcon;
    //状态，0正常1下架
    private Integer productStatus;
    //类目编号
    private Integer categoryType;

}
