package com.ap.designPatternsPractice.behavioural.observer;

import java.util.Scanner;

/**
 * Created by APandey1 on 21-10-2017.
 */
public class App {
    public static void main(String[] args) {
        Person p1 = new Person("a");
        Person p2 = new Person("b");
        Person p3 = new Person("c");
        ScoreCard s = new ScoreCard("India");

        s.attach(p1);
        s.attach(p2);
        s.attach(p3);
        s.setScore(100);
    }
}
