package com.ap.java8.practice;

/**
 * Created by apandey on 22-06-2017.
 */
public class LamdaProgramming {
    public static void main(String[] args) {
        //Simple Lambda Expression
        Runnable r1 = () -> System.out.println("First expression!!");
        r1.run();
        r1.run();
        r1.run();
        CommonPrinter.r1.run();
    }
}
