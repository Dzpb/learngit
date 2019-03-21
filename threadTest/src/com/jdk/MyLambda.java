package com.jdk;

@FunctionalInterface
public interface MyLambda {
    public void test1(String y);

    //如果继续添加一个抽象方法会报错
    //public void test();

    // default 方法可以任意定义
    default String test2(){
        return "这是default的test2方法";
    }

    default String test3(){
        return "这是default的test3方法";
    }

    // static 方法也可以定义
    static String test4(){
        return "这是static的test4方法";
    }
}
