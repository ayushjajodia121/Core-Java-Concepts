package com.jajodia.core.polymorphism;
class A{
    public void show() {
        System.out.println("in Class A's show method");
    }
    public void playMusic() {
        System.out.println("in class A's playing music");
    }
}
class B extends A {

    // overridden method
    public void show() {
        System.out.println("in class B's show method");
    }
    //new method
    public void playFootball() {
        System.out.println("in class b playing football");
    }
}
public class runTime {
    public static void main(String[] args) {
        A obj = new B();
        new B().playFootball();                            // anonymous inner object
        obj.show();
    }
}
