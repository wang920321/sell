package com.kpwang.sell.controller;

import com.kpwang.sell.VO.ProductInfoVO;
import com.kpwang.sell.VO.ProductVO;
import com.kpwang.sell.VO.ResultVO;
import com.kpwang.sell.dataobject.ProductCategory;
import com.kpwang.sell.dataobject.ProductInfo;
import com.kpwang.sell.service.CategoryService;
import com.kpwang.sell.service.ProductService;
import com.kpwang.sell.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kpwang
 * @create 2019-08-2019/8/16-0:04
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductContorller {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResultVO list(){
        //1查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2查询类目（一次性查询）
        //List<Integer> categoryTypeList=new ArrayList<>();
        //传统方法
        /*for(ProductInfo productInfo:productInfoList){
            categoryTypeList.add(productInfo.getCategoryType());
        }*/
        //精简方法（java2,lambda）
        List<Integer> categoryTypeList = productInfoList.stream()
                                         .map(e -> e.getCategoryType())
                                         .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3数据拼装
        List<ProductVO> productVOList=new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO=new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList=new ArrayList<>();
            for(ProductInfo productInfo:productInfoList){
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO=new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
