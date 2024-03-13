package com.heroxin.web.controller.internship;

/*
    @Author lixin
    
    @Create 2024-03-13-14:49

    @Description:
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {
    @GetMapping("/lixin")
    public String hello(){
        return "hello lixin";
    }
}
