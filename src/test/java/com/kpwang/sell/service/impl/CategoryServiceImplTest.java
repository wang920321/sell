package com.kpwang.sell.service.impl;

import com.kpwang.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kpwang
 * @create 2019-08-2019/8/15-23:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = categoryService.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertNotEquals(0,list.size());

    }

    @Test
    public void save() {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryType(10);
        productCategory.setCategoryName("男生专享");
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);

    }
}