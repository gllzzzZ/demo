package com.jk.user.controller;

import com.jk.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("Test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("Yes")
    public void Test(){

        System.err.println("这是控制层");
        testService.Test();

    }


}
