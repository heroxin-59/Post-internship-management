package com.heroxin.web.controller.test;

/*
    @Author Heroxin
    
    @Create 2023-12-28-10:51

    @Description:
*/

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "测试接口")
@RestController
@RequestMapping("/test")
public class HelloController {
    @ApiOperation("Hello World!!!")
    @GetMapping("/hello")
    public String hello() {
        return "Hello heroxin";
    }
}
