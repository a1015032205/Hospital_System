package org.java.config;

import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;

/**
 *    
 *  @Author:秒度   
 *  @Date:2019/7/8 0008 16:02     
 *  连接集群
 */
@Configuration
public class JedisClient {
    //@Value("${spring.redis.cluster.nodes}")
    private String nodes;

    /**
     * 当方法上面加了@Bean这个注解，系统将会在服务启动时，自动调用方法，创建对象 JedisCluter，并且把对象放在spring容器，通过自动绑定的注解，
     * 可以获得该对象
     *
     * @Autowired
     * priviate JedisCluster cluster;
     * 192.168.160.132:7001,192.168.160.132:7002,192.168.160.132:7003,192.168.160.132:7004,192.168.160.132:7005,192.168.160.132:7006
     * @return
     */
    //@Bean
    public JedisCluster JedisCluster() {
        //创建一个集合，存放集群中的所有主机
        HashSet<HostAndPort> set = new HashSet<>();
        String[] hps = nodes.split(",");
        for (String hp : hps) {
            String[] hostAndPort = hp.split(":");
            String host = hostAndPort[0];
            int port = Integer.parseInt(hostAndPort[1]);
            HostAndPort k = new HostAndPort(host, port);
            set.add(k);
        }
        JedisCluster jedisCluster = new JedisCluster(set);
        return jedisCluster;
    }
}
