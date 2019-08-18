package com.kpwang.sell.service.impl;

import com.kpwang.sell.dataobject.ProductInfo;
import com.kpwang.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-23:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() {
        ProductInfo result = productService.findOne("123456");
        Assert.assertEquals("123456",result.getProductId());

    }

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertNotEquals(0,list.size());

    }

    @Test
    public void findAll() {
        PageRequest request=new PageRequest(0,2);
        Page<ProductInfo> page = productService.findAll(request);
        System.out.println(page.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好吃的");
        productInfo.setProductIcon("http://xx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(4);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}