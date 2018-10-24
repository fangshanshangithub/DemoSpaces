/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/10/8 Time: 下午2:45
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.bootweb.webs.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


/**
 * 定时任务实现方法(一) -- 只在这里配置就行，这个是单线程的【2个定时任务由一个线程调用】
 */
/*@Configuration
@EnableScheduling
public class SchedulingConfig {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Scheduled(cron = "0/3 * * * * ?")
    public void runTask1() {
        logger.info("runTask-1-定时任务启动");
    }

    @Scheduled(cron = "0/4 * * * * ?")
    public void runTask2() {
        logger.info("runTask-2-定时任务启动");
    }
}*/
