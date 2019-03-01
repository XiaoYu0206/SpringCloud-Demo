package com.xiaoyu.springcloud.zookeeper.member2.api;

import com.xiaoyu.springcloud.zookeeper.member2.response.ResultUtil;
import com.xiaoyu.springcloud.zookeeper.member2.response.ResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "member")
public class Member2Controller {

    @RequestMapping(value = "get")
    public ResultVo getMemberInfo(){
        return ResultUtil.success( "会员服务被调用，当前使用端口号8082");
    }
}
