package org.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 秒度
 * @Date 2019-08-12 13:45
 * @Description：demo
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "hello world";
    }
}
