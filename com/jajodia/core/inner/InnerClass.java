package com.jajodia.core.inner;

class A{
    static class B{
        public void config(){
            System.out.println("in config of B class present inside A class");
        }
    }
    public void show(){
        System.out.println("in show method of A class");
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj2  = new A.B();
        obj2.config();
    }
}
