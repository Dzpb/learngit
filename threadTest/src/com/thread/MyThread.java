package com.thread;

public class MyThread {

    public static void main(String[] args) {
        SaleTicketThread st = new SaleTicketThread();
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class SaleTicketThread implements Runnable{
    int count = 10;
    @Override
    public void run() {
        while (count > 0){
            count--;
           System.out.println(Thread.currentThread().getName()+" 售出一张票，剩余"+count+"张票");
        }
    }
}