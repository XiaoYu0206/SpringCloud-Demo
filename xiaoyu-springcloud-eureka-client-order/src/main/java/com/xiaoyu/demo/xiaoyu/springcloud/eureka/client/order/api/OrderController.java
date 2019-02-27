package com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.order.api;

import com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.order.response.ResultUtil;
import com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.order.response.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * eureka客户端订单模块接口测试
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getOrder")
    public ResultVo getOrder(){
        String url = "http://xiaoyu-eureka-member-client-member/member/info";
        String result = restTemplate.getForObject(url,String.class);
        System.out.println("订单服务调用会员服务："+result);
        return ResultUtil.success(result);
    }
}
