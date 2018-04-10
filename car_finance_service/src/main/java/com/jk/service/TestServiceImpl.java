package com.jk.service;


import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService  {


    public void Test() {

        System.err.println("这是业务逻辑层");

    }


   /* @Resource
    private TestMapper testMapper;*/


}
