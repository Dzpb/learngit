package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int a=11;
        int b=13;
        a=a^b;
        System.out.println(a);
        b=a^b;
        System.out.println(b);
        a = a^b;
        System.out.println(a);

    }
}
