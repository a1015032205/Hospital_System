package org.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author 秒度
 * @Date 2019-08-14 19:10
 * @Description：对文件的路径进行配置,创建一个虚拟路径/Path/** ，
 * 即只要在<img src="/Path/picName.jpg" />便可以直接引用图片  *这是图片的物理路径  "file:/+本地图片的地址
 */


@Configuration
public class MyWebAppConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/Path/**").addResourceLocations("file:/G:/IDEA/hospital/src/main/resources/static/");
        super.addResourceHandlers(registry);
    }
}
