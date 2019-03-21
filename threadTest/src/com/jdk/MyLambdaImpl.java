package com.jdk;

public class MyLambdaImpl implements MyLambda {
    @Override
    public void test1(String y) {
       // System.out.println("哈哈哈哈");
    }

    public static void main(String[] args) {
        MyLambdaImpl myLambda = new MyLambdaImpl();
        String t2 = myLambda.test2();
        String t3 = myLambda.test3();
        String t4 = MyLambda.test4();
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        MyLambda m = y -> System.out.println("ss"+y);
        System.out.println(m.test2());
        m.test1("hh");
    }
}
