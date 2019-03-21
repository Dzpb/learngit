package com.enums;


public class EnumClass {

    enum Shrubbery{GROUND, CRAWLING, HANGING}
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()){
            System.out.println(s + "  ordinal:  " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s.equals(Shrubbery.CRAWLING));
            System.out.println(s==Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("---------------------------------------------");
        }
        System.out.println("开始下一个for循环");
        for (String s : "GROUND,CRAWLING,HANGING".split(",")){
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrub);
        }
    }


}
