package com.ujiuye.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 44213
 * @Date 2020/1/14 16:49
 * @Version 1.0
 */
@Configuration
public class ConfigBean {
    //向容器添加RestTemplate组件  直接通过该组件可调用REST接口
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}