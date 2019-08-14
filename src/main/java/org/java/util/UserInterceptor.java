package org.java.util;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019/7/16 0016 21:20
 * 拦截器
 */

public class UserInterceptor implements HandlerInterceptor {

    /**
     * 前置拦截
     * 进入控制器之前要执行方法：该方法适合判断，用户是否拥有访问权限，如果有，则进入控制器，如果没有则不进入控制器
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //session中，获得user,判断user是否为null,，如果为null，表示用户没有登录，就要进行login.html进行登录
        Map<String, Object> user = (Map<String, Object>) request.getSession().getAttribute("user");
        if (user == null) {
            //没有登录
            //发出请求，重定向到登录的页面
            response.sendRedirect("/jump/login");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
