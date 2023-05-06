package com.jajodia.core.anonymous.inner;
class A{
    public void show(){
        System.out.println("in show method");
    }
    public void playMusic(){
        System.out.println("playing Bethovan....");
    }
}
class B extends A{
    public void show(){
        super.playMusic();
        System.out.println("in B class's show method");
    }
    public void playFootball() {
        System.out.println("playing football from B class...");
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void show() {
//                super.show();
                System.out.println("in new show method");
            }
            public void playFootball(){         // anonymous inner class can only override methods and cannot include new methods/as wont be visible
                System.out.println("playing football...");
            }
        };
        obj.playMusic();
//        obj.playFootball();
        obj.show();
    }
}
