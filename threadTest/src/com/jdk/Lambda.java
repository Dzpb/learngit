package com.jdk;

import java.util.*;

public class Lambda {

    // 常规的Collections的排序方法
    public void test1(){
        List<String> list = Arrays.asList("aaa","fas","ser","bbb","ccc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (String str : list){
            System.out.println(str);
        }
    }

    //带参数的Lambda的写法
    public void testLambda1(){
        List<String> list = Arrays.asList("aaa","fas","ser","bbb","ccc");
        Collections.sort(list , (String a, String b)->{
            return b.compareTo(a);
        });
        for (String str : list){
            System.out.println(str);
        }
    }

    //不带参数的Lambda的写法
    public void testLambda2(){
        List<String> list = Arrays.asList("aaa","fas","ser","bbb","ccc");
        Collections.sort(list, (a,b)->b.compareTo(a));
        for (String str : list){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        //lambda.test1();
        //lambda.testLambda1();
        lambda.testLambda2();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer count2 = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(count2);

    }
}
