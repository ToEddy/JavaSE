package com.eddy.Thread.createThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"======"+i);
        }
    }
}
