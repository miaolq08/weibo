package com.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-05 09:39
 **/
@SpringBootApplication
@EnableFeignClients
public class BokeConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BokeConsumerApplication.class,args);
    }
}
