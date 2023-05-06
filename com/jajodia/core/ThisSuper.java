package com.jajodia.core;

class A{

    int age;
    String name;
    public A(){
        System.out.println("in a default ");
    }
    public A(int age){
        this.age=age;
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super(2);
        System.out.println("In B constructor");
    }
    public B(int a){
        this();
        System.out.println("in b int");
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
