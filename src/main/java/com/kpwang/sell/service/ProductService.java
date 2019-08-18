package com.kpwang.sell.service;

import com.kpwang.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-23:33
 */
public interface ProductService {
    ProductInfo findOne(String productId);
    //查询所有上架商品列表
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    //加库存

    //减库存
}
