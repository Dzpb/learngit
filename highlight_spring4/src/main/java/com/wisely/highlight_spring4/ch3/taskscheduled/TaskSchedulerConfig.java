package com.wisely.highlight_spring4.ch3.taskscheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskscheduled")
@EnableScheduling               // 开启对计划任务的支持
public class TaskSchedulerConfig {

}
