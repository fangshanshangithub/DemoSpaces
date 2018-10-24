/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/10/8 Time: 下午2:41
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.bootweb.webs.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务实现方法(二)
 * -- 这里这样配置，application启动类添加@EnableScheduling注解
 * 还是单线程执行多任务的方式
 */
@Component
public class ScheduledTask {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelayString = "${jobs.fixedDelay}")
    public void getTask1() {
        logger.info("任务1,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "${jobs.cron}")
    public void getTask2() {
        logger.info("任务2,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
    }
}