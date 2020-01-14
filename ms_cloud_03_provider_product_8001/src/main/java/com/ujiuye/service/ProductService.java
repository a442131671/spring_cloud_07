package com.ujiuye.service;

import com.ujiuye.entites.Product;

import java.util.List;

/**
 * @Author 44213
 * @Date 2020/1/14 15:57
 * @Version 1.0
 */
public interface ProductService {
    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}
