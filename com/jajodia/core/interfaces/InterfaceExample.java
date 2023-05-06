package com.jajodia.core.interfaces;

interface A{
    int age=2;
    void show();
}
class X implements A{

    int number;
    @Override
   // private void show() {                                    // method overriding but scope is reducing hence, compile time error
        public void show(){
        System.out.println("in show of X");
    }
}
class Y extends X{
    private int number;
}
public class InterfaceExample {
    public static void main(String[] args) {
        A obj = new X();
//        A.age=90;
        obj.show();
//        obj.age;
        Y nObj = new Y();
    }
}
