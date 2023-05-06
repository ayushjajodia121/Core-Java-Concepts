package com.jajodia.core.statics;

class A{
    int age;
    static String schoolName;
    static{
        System.out.println("in static method of A class");
    }
    static {
        System.out.println("another static block inside A class");
    }
}
class B extends A{
    static {
        System.out.println("in static method of B class");
    }
}
class C extends B{
    static
    {
        System.out.println("inside static block of C class");
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
//        A obj = new A();
//        B obj1 = new B();
        C obj1 = new C();
        System.out.println(obj1.age);
    }
}
