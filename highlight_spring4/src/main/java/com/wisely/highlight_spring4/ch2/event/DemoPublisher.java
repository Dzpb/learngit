package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;      //注入ApplicationContext用来发布事件
    public void publish(String msg){
        System.out.println("进入 DemoPublisher 方法！！！");
        applicationContext.publishEvent(new DemonEvent(this,msg));   // 使用 publishEvent 方法来发布
    }
}
