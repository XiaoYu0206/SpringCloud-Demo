package com.xiaoyu.springcloud.zookeeper.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SpringCloud使用 Zookeeper作为注册中心案例 订单模块
 * @author xiaoyu
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XiaoYuSpringCloudZookeeperOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuSpringCloudZookeeperOrderApplication.class);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
