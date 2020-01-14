package com.ujiuye.mapper;

import com.ujiuye.entites.Product;

import java.util.List;

/**
 * @Author 44213
 * @Date 2020/1/14 16:00
 * @Version 1.0
 */
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
