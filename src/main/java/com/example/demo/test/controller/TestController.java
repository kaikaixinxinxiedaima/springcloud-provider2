package com.example.demo.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name)
    {
        System.out.println(name+"发送了请求。。。");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hi " + name + ",i am from port:" + port;
    }
}
