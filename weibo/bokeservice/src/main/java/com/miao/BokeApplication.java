package com.miao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-04 15:44
 **/
@SpringBootApplication
@MapperScan("com.miao.dao")
public class BokeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BokeApplication.class,args);
    }
}
