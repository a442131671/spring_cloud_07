package com.ujiuye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 44213
 * @Date 2020/1/14 16:05
 * @Version 1.0
 */
@MapperScan("com.ujiuye.mapper")// 扫描所有的mapper接口
@SpringBootApplication
public class ms_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ms_8001.class,args);
    }

}
