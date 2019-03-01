package com.xiaoyu.springcloud.zookeeper.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * springcloud使用zookeeper作为注册中心案例 会员模块
 * @author xiaoyu
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XiaoYuSpringCloudZookeeperMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuSpringCloudZookeeperMemberApplication.class);
    }
}
