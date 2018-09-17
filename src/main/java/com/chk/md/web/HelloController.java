package com.chk.md.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:kaichenr
 * @Date:2018/9/14 16:10
 * @Description:
 **/
@RestController("/")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
