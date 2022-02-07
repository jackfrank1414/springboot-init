package com.jackfrank.springbootinit.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 22:51
 */
//@Configuration
//@EnableScheduling
@Slf4j
public class MyTask {

    /**
     * 每隔五秒执行一次task
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void publishTask(){
        log.info("开始执行任务：" + LocalDateTime.now());
    }
}
