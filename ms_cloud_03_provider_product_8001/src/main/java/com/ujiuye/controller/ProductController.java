package com.ujiuye.controller;

import com.ujiuye.entites.Product;
import com.ujiuye.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 44213
 * @Date 2020/1/14 16:00
 * @Version 1.0
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Product product){
        return productService.add(product);
    }
    @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id){
        return productService.get(id);
    }
    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    public List<Product> list(){
        return productService.list();
    }
}
