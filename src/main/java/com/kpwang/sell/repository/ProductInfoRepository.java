package com.kpwang.sell.repository;

import com.kpwang.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-23:20
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
