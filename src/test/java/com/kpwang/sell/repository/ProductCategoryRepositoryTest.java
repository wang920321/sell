package com.kpwang.sell.repository;

import com.kpwang.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import javax.xml.transform.Source;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kpwang
 * @create 2019-08-2019/8/14-23:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(3);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(5);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list=Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result);
    }
}