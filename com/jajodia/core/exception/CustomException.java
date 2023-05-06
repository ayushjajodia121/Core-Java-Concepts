package com.jajodia.core.exception;

class AyushException extends RuntimeException{

    public AyushException(String msg) {
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i=9;
        try{
            if(i!=0){
                throw new AyushException("Kuch to gadbad h");
            }
        }
        catch(AyushException e){
            System.out.println(e);
        }
    }
}
