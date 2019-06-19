package com.lhj.dubboProvider;

import com.lhj.dubboApi.DemoService;

public class DemoServiceImpl implements DemoService {
    public String HelloDubbo() {
        System.out.println("Hello Dubbo!!");
        return "Hello Dubbo!";
    }
}
