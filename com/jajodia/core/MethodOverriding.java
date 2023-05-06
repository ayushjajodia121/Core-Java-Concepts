package com.jajodia.core;

class Calc{
    protected int age=0;
    private char name='A';
    public int add(int n1, int n2){
        return n1 + n2;
    }
}
class AdvCalc{
    Calc obj = new Calc();
    public double add(){
        System.out.println(obj.age);
//        System.out.println(obj.name);
        return 2d;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obh = new AdvCalc();
        obh.add();
    }
}
