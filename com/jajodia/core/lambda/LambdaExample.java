package com.jajodia.core.lambda;

@FunctionalInterface
interface A{
    void show();
}
@FunctionalInterface
interface Add{
    int addTwo(int i, int j);
}
public class LambdaExample {
    public static void main(String[] args) {
//        A obj = new A(){
//            @Override
//            public void show() {
//                System.out.println("in show method");
//            }
//        };
        A obj = () -> System.out.println("in show");             //implemented same using Lambda expressions
        Add obj1 = (int i, int j) -> {
                return i+j;
        };
        Add obj2 = Integer::sum;
        obj.show();
        System.out.println(obj1.addTwo(4,5));
    };
}
