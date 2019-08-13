package org.java.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 秒度
 * @Date 2019-08-13 21:35
 * @Description：异常处理
 */
@Controller
public class ExpectionController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "redirect:/error";
    }

    @RequestMapping(value = {"/error"})
    public String error() {
        return "/error/404";
    }
}
