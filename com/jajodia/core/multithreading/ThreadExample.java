package com.jajodia.core.multithreading;

class A extends Thread{
    public void show(){
        System.out.println("in show method of A");
    }
}
class B extends Thread{
    public void show(){
        System.out.println("in show method of B");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Thread x = new Thread();
    }
}
