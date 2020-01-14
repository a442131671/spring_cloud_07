package com.ujiuye.controller;

import com.ujiuye.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 44213
 * @Date 2020/1/14 16:48
 * @Version 1.0
 */
@RestController
public class ProductController {
    private static final String REST_URL_PREFIX="http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product){
        return restTemplate.postForObject(REST_URL_PREFIX+"/product/add",product,Boolean.class);
    }
    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/product/get/"+id,Product.class);
    }
    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/product/list",List.class);
    }
}
