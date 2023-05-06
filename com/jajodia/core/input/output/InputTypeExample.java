package com.jajodia.core.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputTypeExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
       // int read = System.in.read();           // provides ascii value and reads only first character
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);          // we can take input from anywhere whether it's a file or snything alse
//        bf.close():                                         // it's a resource so need to close it properly
//        System.out.println(read);
//        int i = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);

    }
}
