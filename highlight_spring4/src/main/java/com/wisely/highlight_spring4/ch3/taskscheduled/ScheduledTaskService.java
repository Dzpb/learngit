package com.wisely.highlight_spring4.ch3.taskscheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5s执行一次：" + sdf.format(new Date()));
    }

    @Scheduled(cron = "0 31 23 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间：" + sdf.format(new Date()) + " 执行");
    }
}
