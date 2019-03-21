package com.sjms.bridge;

public class MyBridge extends Bridge {

    public void method(){
        System.out.println("这是MyBridge中打印的。。。 getSource().method()方法前");
        getSource().method();
        System.out.println("这是MyBridge中打印的。。。 getSource().method()方法后");
    }
}
