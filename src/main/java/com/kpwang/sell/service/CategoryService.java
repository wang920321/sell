package com.kpwang.sell.service;

import com.kpwang.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-22:59
 */
public interface CategoryService {
    ProductCategory findOne (Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
