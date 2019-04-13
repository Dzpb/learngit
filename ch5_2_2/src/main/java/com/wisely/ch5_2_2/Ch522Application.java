package com.wisely.ch5_2_2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch522Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
        /*
        设置取消启动时控制台输出  spring  图案
        SpringApplication application = new SpringApplication(Ch522Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);*/
    }

}
