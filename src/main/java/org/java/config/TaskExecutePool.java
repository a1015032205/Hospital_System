package org.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author 秒度
 * @Date 2019/7/21 0021 14:58
 * 创建线程池
 */

@Configuration
public class TaskExecutePool {

    @Bean("myAsyncPool")
    public Executor myTaskAsyncPool() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心线程数：线程池创建时候初始化的线程数
        executor.setCorePoolSize(5);
        //最大线程数：线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
        executor.setMaxPoolSize(10);
        //缓冲队列：用来缓冲执行任务的队列
        executor.setQueueCapacity(10);
        //允许线程的空闲时间60秒：当超过了核心线程出之外的线程在空闲时间到达之后会被销毁
        executor.setKeepAliveSeconds(60);
        //线程池名的前缀：设置好了之后可以方便我们定位处理任务所在的线程池
        executor.setThreadNamePrefix("MyExecutor-");
        // 当pool已经达到max size的时候，如何处理新任务
        // 这里采用了CallerRunsPolicy策略，当线程池没有处理能力的时候，
        // 该策略会直接在 execute 方法的调用线程中运行被拒绝的任务；
        // 如果执行程序已关闭，则会丢弃该任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
        /*

        ThreadPoolExecutor.AbortPolicy()  抛出java.util.concurrent.RejectedExecutionException异常 
        ThreadPoolExecutor.CallerRunsPolicy() 重试添加当前的任务，他会自动重复调用execute()方法 
        ThreadPoolExecutor.DiscardOldestPolicy() 抛弃旧的任务 
        ThreadPoolExecutor.DiscardPolicy() 抛弃当前的任务 

        */
    }

}
