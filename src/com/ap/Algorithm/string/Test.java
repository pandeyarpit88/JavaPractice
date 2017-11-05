package com.ap.Algorithm.string;

import java.io.IOException;
import java.util.HashSet;

/**
 * Created by APandey1 on 05-11-2017.
 */
//https://www.journaldev.com/370/java-programming-interview-questions
public class Test {
    public static void main(String[] args) {
        /*String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);*/
        //---------------------------------
        /*String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(start + end);
        System.out.println(s3.substring(start, end));*/
        //--------------------------------
        /*HashSet shortSet = new HashSet();
        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size());
        System.out.println(shortSet);*/
        //--------------------------------
        /*boolean flag=false;
        try {
            if (flag) {
                while (true) {
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("In Finally");
        }*/
        //--------------------------------
        /*String str = null;
        String str1="abc";
        System.out.println(str1.equals("abc") | str.equals(null));*/
        //--------------------------------
        /*String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);*/
        //--------------------------------
        /*int x = 10*10-10;
        System.out.println(x);*/
        //--------------------------------
       /* try {
            throw new IOException("Hello");
        }catch(IOException | Exception e) {
            System.out.println(e.getMessage());*/
        }
    }
}
