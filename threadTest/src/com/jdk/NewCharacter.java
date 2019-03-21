package com.jdk;

public interface NewCharacter {

    public void test1();

    public default void test2(){
        System.out.println("这是JDK1.8新特性！！！");
    }
}
