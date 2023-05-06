package com.jajodia.core.autobxing;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int i = 7;                // value stored inside primitive variable
       // Integer x = new Integer(i);                   // deprecated instead we can use
        Integer x = Integer.valueOf(i);               //Returns an Integer instance representing the specified int value. If a new Integer instance is not required,
                                                      // this method should generally be used in preference to the constructor Integer(int),
                                                      // as this method is likely to yield significantly better space and time performance by caching frequently requested values.
                                                     // This method will always cache values in the range -128 to 127, inclusive, and may cache other values outside of this range.
        Integer y = Integer.valueOf(i);
        char f = 45;
        System.out.println(f);
//        Integer z = ;
        System.out.println("hashcode for x "+x);
        System.out.println("hashcode for y "+y.hashCode());
    }
}
