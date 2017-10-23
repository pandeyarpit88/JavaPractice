package com.ap.Algorithm.string;

import java.util.concurrent.atomic.AtomicReference;

class MyString {
    String s;
    MyString(String s) {
        this.s = s;
    }
    public String get() {
        return s;
    }
    public void set(String s) {
        this.s = s;
    }
}

/**
 * Created by APandey1 on 23-10-2017.
 */
public class StringSwap {

    public static void swap(AtomicReference<String> a, AtomicReference<String> b) {
        a.set(b.getAndSet(a.get()));
    }

    public static void swap(MyString a, MyString b) {
        String b1 = b.get();
        b.set(a.get());
        a.set(b1);
    }

    public static void main(String[] args) {
        /*
        //Sol1
        AtomicReference<String> s1 = new AtomicReference("Hello");
        AtomicReference<String> s2 = new AtomicReference("World");
        */
        //Sol2
        MyString s1 = new MyString("Hello");
        MyString s2 = new MyString("World");
        swap(s1,s2);

        System.out.println(s1.get() + " " + s2.get());
    }
}
