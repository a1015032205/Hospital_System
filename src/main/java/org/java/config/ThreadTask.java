package org.java.config;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Author 秒度
 * @Date 2019/7/21 0021 15:04
 */

@Component
public class ThreadTask {

    Logger log = LoggerFactory.getLogger(ThreadTask.class);

    public static Random random = new Random();

    SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");

    //@Async(value = "myAsyncPool")
    public void testTask(int i) throws Exception {
        System.out.println(Thread.currentThread().getName() + "--" + i + "--时间：" + format.format(new Date()));
        Thread.sleep(3000);
    }
}