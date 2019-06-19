package com.lhj;

import com.lhj.dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsummer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-consummer.xml");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("get demoService");
        System.out.println(demoService.HelloDubbo());

    }
}
