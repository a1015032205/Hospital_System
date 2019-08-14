package org.java.config;

import org.java.util.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 秒度
 * @Date 2019/7/16 0016 18:13
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 控制页面跳转
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //跳转到登录页面
        registry.addViewController("/jump/login").setViewName("/login");
        //初始前端页面
        registry.addViewController("/index").setViewName("/index");

    }

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] pathPattern = {""};
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(pathPattern);
    }


}
