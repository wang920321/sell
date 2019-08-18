package com.kpwang.sell.service.impl;

import com.kpwang.sell.dataobject.ProductInfo;
import com.kpwang.sell.enums.ProductStatusEnum;
import com.kpwang.sell.repository.ProductInfoRepository;
import com.kpwang.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-23:36
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {

        return repository.save(productInfo);
    }
}
