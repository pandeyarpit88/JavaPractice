package com.ap.java8.practice;

/**
 * Created by apandey on 22-06-2017.
 */
public class CommonPrinter {
    //static runnable
    public static Runnable r1 = () -> System.out.println("printer");

    //interface for the format string signature
    interface FormatString {String format(String value);}
    //create an expression of the interface type
    public static FormatString fs = (String value) -> {
        return "From my first functional service value " + value;
    };


}
