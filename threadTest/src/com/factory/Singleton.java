package com.factory;

public class Singleton {
    private Singleton(){};
    private static Singleton singleton= null;
    public static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s = new Singleton();
        System.out.println(s);
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s1.equals(s2));

    }
}
