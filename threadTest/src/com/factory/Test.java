package com.factory;

public class Test {

    public static void main(String[] args) {
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
 //       sender.send();

        String str = "hello";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        String rev = "";
        for (int i= chars.length-1; i>=0; i--){
            rev += chars[i];
        }
        System.out.println(rev);
    }
}
