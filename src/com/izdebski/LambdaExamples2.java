package com.izdebski;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaExamples2 {

    public static void main(String[] args) throws FileNotFoundException {

        //Java lambda expressin can implement interfaces with
        // a single unimplemented method (abstract) method,
        // but as many default or static methods as you like.

        MyInterface myInterface = (String text) -> {
            System.out.println(text);
        };

        MyInterface.printItToSystemOut("MBT Revolution");

        myInterface.printUtf8To("New File", new FileOutputStream("data.txt"));

        MyInterface.printItToSystemOut("Another File");
    }
}