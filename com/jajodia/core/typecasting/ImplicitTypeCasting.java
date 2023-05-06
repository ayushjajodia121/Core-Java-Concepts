package com.jajodia.core.typecasting;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        int x =8;
        double xx = 45.54;
//        boolean t = (double)x;
        x=(int)xx;                      // explicit conversion
//        System.out.println(x);
        char c =' ';
        int i = c;                      //implicit conversion
        System.out.println(i);
    }
}
