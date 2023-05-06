package com.jajodia.core.object.methods;

class A{
    int age=20;
    String name;
}
class B{

}
public class EqualsToStringHashcode {
    public static void main(String[] args) {
        A obj = new A();
        A obj2 = new A();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj==obj2);
    }
}
