package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @Auther:TongKai
 * @ClassName:HelloWorldController
 * @Date:2021/7/22 13:21
 * @功能描述: $FunctionDescription
 * @Version:1.0
 */
@RestController
@RequestMapping("test")
public class HelloWorldController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello ";
    }
}
