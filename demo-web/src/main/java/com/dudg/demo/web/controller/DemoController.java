package com.dudg.demo.web.controller;

import com.dudg.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("test")
    public String test(){
//        return "这就对了！";
        return demoService.test();
    }
}
