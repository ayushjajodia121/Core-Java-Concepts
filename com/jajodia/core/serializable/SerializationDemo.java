package com.jajodia.core.serializable;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        A obj = new A();
        obj.i=45;
        System.out.println(obj);
        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        A objNew = (A) ois.readObject();
        System.out.println("value of object"+objNew.i);
    }
}
class A implements Serializable {
    int i;
}
