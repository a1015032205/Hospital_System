package org.java.ex;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 秒度
 * @Date 2019/7/15 0015 23:01
 */
@ControllerAdvice
public class GlobalDefaultHandlerException {
    @ExceptionHandler(value = Exception.class)
    public String handleException(HttpServletRequest req, Exception ex) {
        System.out.println("异常：" + ex.getMessage());
        return "/err";
    }
}

