package com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.api;

import com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.response.ResultUtil;
import com.xiaoyu.demo.xiaoyu.springcloud.eureka.client.response.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka客户端会员模块接口测试
 */
@RestController
@RequestMapping("member")
public class MemberController {

    @GetMapping("info")
    public ResultVo getInfo(){
        return ResultUtil.success("访问成功，端口：8083，当前会员信息：张三");
    }
}
