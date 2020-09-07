package com.miao.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <h3>springcloudalibaba</h3>
 *
 * @author : MLQ
 * @date : 2020-09-01 12:38
 **/
@Configuration
public class WebConfig {
    //开启ribbon均衡负载
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    //开启随机访问
    @Bean
    public IRule createIRule(){
        return new RandomRule();
    }
}
