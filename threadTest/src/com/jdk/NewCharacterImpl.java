package com.jdk;

public class NewCharacterImpl implements NewCharacter{

    @Override
    public void test1() {
        System.out.println("这是常规jdk特性！！");
    }

    public static void main(String[] args) {
        NewCharacterImpl newCharacter = new NewCharacterImpl();
        newCharacter.test1();
        newCharacter.test2();
    }
}
