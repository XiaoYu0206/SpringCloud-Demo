package com.xiaoyu.demo.xiaoyu.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = "com.xiaoyu.demo.xiaoyu.springcloud.eureka.server")
@EnableEurekaServer
public class XiaoyuSpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuSpringcloudEurekaServerApplication.class, args);
    }

}
