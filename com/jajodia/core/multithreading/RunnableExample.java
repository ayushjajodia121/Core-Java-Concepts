package com.jajodia.core.multithreading;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable obj1 = () -> System.out.println("in first thread");
        Runnable obj2 = () -> System.out.println("in second thread");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
