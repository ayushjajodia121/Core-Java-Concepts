package com.jajodia.core;

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public double add(int n1, int n2, int n3) {
        return 2;
    }
}
public class HelloWorld {
    static int x;
    static int y;
    public static void main(String[] args) {
//        HelloWorld newObject = new HelloWorld();
//        newObject.x=1;
//        newObject.y=20;
//        System.out.println(" x = "+newObject.x+"  y = "+newObject.y);
//        change(newObject);
//        System.out.println(" x = "+newObject.x+"  y = "+newObject.y);
        StringBuffer sb = new StringBuffer("Ayush");
        String s1 = sb.toString();
        System.out.println(sb.hashCode());
        System.out.println(sb);
        sb.append(" Jajodia");
        System.out.println(sb.hashCode());
        System.out.println(sb);
    }
    private static void change(HelloWorld object) {
        object.x = 45;
        object.y=10;
    }
}
