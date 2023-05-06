package com.jajodia.core.enums;

enum EnumHandsOn {
    Running(45),Success(98), Stopped, Failed(98), Pending(56);

    private EnumHandsOn(int age) {                         //private as we are defining objects in the class itself
        this.setAge(age);
    }
    private EnumHandsOn(){
        this.age=40;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

}
public class EnumOverview{
    public static void main(String[] args) {
        EnumHandsOn obj = EnumHandsOn.Stopped;
        System.out.println(obj.getAge());
    }
}
