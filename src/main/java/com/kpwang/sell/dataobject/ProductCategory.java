package com.kpwang.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author kpwang
 * @create 2019-08-2019/8/14-23:18
 */
@Entity
@DynamicUpdate//数据库中设置的动态更新
@Data//代替get  set  toString方法
public class ProductCategory {
    //类目id
    @Id//数据库id
    @GeneratedValue//自增长
    private Integer categoryId;
    //类目名字
    private String categoryName;
    //类目编号
    private  Integer categoryType;

}
