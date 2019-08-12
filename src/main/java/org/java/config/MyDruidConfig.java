package org.java.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @title: DruidConfig
 * @author: xiaobing
 * @Description: Druid 数据源配置类
 * @Date: Created in 2019-07-06 20:04
 */
@Configuration
public class MyDruidConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyDruidConfig.class);

    @Value("${druid.loginUsername}")
    private String loginUsername;

    @Value("${druid.loginPassword}")
    private String loginPassword;

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
    /**
     * 配置druid的监控
     * 1、配置一个管理后台的servlet
     * 2、配置一个监控的filter
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        LOGGER.info("init Druid Servlet Configuration");
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),
                "/druid/*");
        Map<String,String> initParams = new HashMap<>(16);

        initParams.put("loginUsername", loginUsername);
        initParams.put("loginPassword", loginPassword);
        //默认就是允许所有访问
        initParams.put("allow","");
        initParams.put("deny","192.168.0.106");

        bean.setInitParameters(initParams);
        return bean;
    }

    /**
     * 配置 Druid 监控 之  web 监控的 filter
     * WebStatFilter：用于配置Web和Druid数据源之间的管理关联监控统计
     */
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>(16);
        initParams.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}


