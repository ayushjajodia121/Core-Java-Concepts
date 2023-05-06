package com.jajodia.core.multithreading;

class Ab{
    int count=0;
    public synchronized void increment(){
        count++;
    }
}
public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Ab ab = new Ab();
        Thread t1 = new Thread(()-> {
            for(int i=0;i<10000;i++){
                ab.increment();
            }
        });
        Thread t2 = new Thread(()-> {
            for(int j=0;j<10000;j++){
                ab.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ab.count);
    }
}
