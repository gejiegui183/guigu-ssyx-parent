package com.atguigu.ssyx.acl.controller;

import com.atguigu.ssyx.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

@Slf4j
@Api(tags = "登录接口")
@RestController
@RequestMapping("/admin/acl/index")
//@CrossOrigin
public class IndexController {

    //1、登录
    @ApiOperation("登录")
    @PostMapping("login")
    public Result login(){
        Map<String , String> map = new HashMap<>();
        map.put("token" , "token-admin");
        return Result.ok(map);

    }

    //2、信息获取8
    @ApiOperation("获取信息")
    @GetMapping("info")
    public Result info(){
        Map<String  , String> map = new HashMap<>();
        map.put("name","admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    //3、退出
    @ApiOperation("退出")
    @PostMapping("logout")
    public Result logout() {
        return Result.ok(null);
    }
}
