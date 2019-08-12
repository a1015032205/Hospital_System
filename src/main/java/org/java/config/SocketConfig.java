package org.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author 秒度
 * @Date 2019/7/31 0031 15:29
 */
@Configuration
public class SocketConfig {
    /**
     * ServerEndpointExporter它可以扫描所有加载了@ServerEndpoint注解的socket服务类..
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
