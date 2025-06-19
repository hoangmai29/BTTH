package com.example.cicd_bt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Chào mừng bạn đến với CTy của Hoàng!";
    }
}
