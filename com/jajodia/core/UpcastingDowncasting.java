package com.jajodia.core;

//abstract class Ab{                                             // if we want to restrict creation of its object
class Ab{
//    private Ab(){
//
//    }
//    public Ab(int x){
//
//    }
    public void show() {
        System.out.println("in Class A's show method");
    }
    public void playMusic() {
        System.out.println("in class A's playing music");
    }
}
class Bc extends Ab {
//    private Bc(){
//
//    }

    // overridden method
    public void show() {
        System.out.println("in class B's show method");
    }
    //new method
    public void playFootball() {
        System.out.println("in class b playing football");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
        Ab obj = new Ab();
        obj.show();
        Ab obj1 = (Ab) new Bc();                 //upcasting
        obj1.show();

        Bc obj3 = (Bc) obj1;                   //downcasting
        obj3.playFootball();

//        Bc obj2 = new Bc();
//        obj2.show();
//
//        Bc obj3 = (Bc) new Ab();
    }
}
