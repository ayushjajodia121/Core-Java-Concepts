package com.jajodia.core.exception;

public class ExceptionExample {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            try{
                int x=14/0;
                System.out.println("inside nested try block");
            }catch(ArithmeticException e){
                System.out.println("nested try block's catch");
            }
            System.out.println("inside try block");
            j=18/i;
        }catch(ArithmeticException e){
            System.out.println("asda");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("outer line");
    }
}
