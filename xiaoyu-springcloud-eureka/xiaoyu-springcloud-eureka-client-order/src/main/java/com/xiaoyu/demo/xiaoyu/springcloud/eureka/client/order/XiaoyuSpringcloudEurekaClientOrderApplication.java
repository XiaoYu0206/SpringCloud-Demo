package com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.order")
@EnableEurekaClient
public class XiaoyuSpringcloudEurekaClientOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuSpringcloudEurekaClientOrderApplication.class, args);
    }

    //解决resttemplate找不到原因，应该把RestTemplate注册到SpringBoot容器中
    @Bean
    @LoadBalanced//如果使用rest方式以别名进行访问，需要依赖ribbon.该注解能让restTemplate在请求时拥有客户端负载均衡能力
    RestTemplate restTemplate(){
        return new RestTemplate();
    }



}
