/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/10/8 Time: 下午3:09
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.bootweb.webs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * 支持多线程执行定时任务 在定时任务实现方法(二) 的基础上实现多线程
 */
@Configuration
//所有的定时任务都放在一个线程池中，定时任务启动时使用不同都线程。
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //设定一个长度10的定时任务线程池
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
    }
}

// 第二种 支持多线程的方式
/*@Configuration
public class ScheduleConfig{
    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(2);
        taskScheduler.setThreadNamePrefix("Task-Name");
        return taskScheduler;
    }
}*/
