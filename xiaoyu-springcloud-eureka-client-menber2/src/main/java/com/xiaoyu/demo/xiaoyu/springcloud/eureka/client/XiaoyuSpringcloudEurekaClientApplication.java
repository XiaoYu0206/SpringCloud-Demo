package com.xiaoyu.demo.xiaoyu.springcloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.xiaoyu.demo.xiaoyu.springcloud.eureka.client")
@EnableEurekaClient
public class XiaoyuSpringcloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuSpringcloudEurekaClientApplication.class, args);
    }

}
