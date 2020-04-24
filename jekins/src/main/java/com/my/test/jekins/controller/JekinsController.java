package com.my.test.jekins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className
 * @Description TODO
 * @Author 付林虎
 * @Date 2020/4/24 10:49
 * @Version V1.0
 */
@RestController
public class JekinsController {
    @RequestMapping("/jekin")
    public String getJekins(){
        return "this is my jekins";
    }
}
