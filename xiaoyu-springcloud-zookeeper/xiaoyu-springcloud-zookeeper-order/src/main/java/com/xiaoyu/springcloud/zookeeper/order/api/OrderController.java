package com.xiaoyu.springcloud.zookeeper.order.api;

import com.xiaoyu.springcloud.zookeeper.order.response.ResultUtil;
import com.xiaoyu.springcloud.zookeeper.order.response.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get")
    public ResultVo getOrder(){
        String connectString = "http://springcloud-zookeeper-member/member/get";
        String response = restTemplate.getForObject(connectString, String.class);
        System.out.println("订单服务调用会员服务: "+response);
        return ResultUtil.success(response);
    }
}
