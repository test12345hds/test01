package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WeiMin
 * @date 2020/9/29 20:35
 */
public class Test01 {

    @GetMapping("/test01")
    @ResponseBody
    public String test01(){
        System.out.println("test01........");
        return "OK";
    }

}
