package com.kpwang.sell.repository;

import com.kpwang.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author kpwang
 * @create 2019-08-2019/8/14-23:22
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
      List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
