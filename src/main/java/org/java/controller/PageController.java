package org.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 秒度
 * @Date 2019-08-13 20:02
 * @Description：页面跳转控制器
 */
@Controller
public class PageController {

    /**
     * 前端页面跳转
     * @param page
     * @return
     */
    @GetMapping(value = {"jump/{page}"})
    public String page(@PathVariable(value = "page") String page) {
        return "/" + page;
    }
}
