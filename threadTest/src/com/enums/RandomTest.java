package com.enums;

public class RandomTest {

    enum Activity{SITTING , LYING , STANDING , HOPPING , RUNNING , DODGING , JUMPING ,FALLING , FLYING}

    public static void main(String[] args) {
        for (int i=0; i<20; i++){
            System.out.println(Enums.random(Activity.class));
        }
    }
}
