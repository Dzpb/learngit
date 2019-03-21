package com.jdk;

public class TestConvertImpl {
    public void test(){
        TestConvert<String, Integer> t = Integer::valueOf;
        Integer i = t.convert("111");
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestConvertImpl testConvert = new TestConvertImpl();
        testConvert.test();

    }

}
