package com.ap.designPatternsPractice.behavioural.observer;

/**
 * Created by APandey1 on 21-10-2017.
 */
public class Person implements Observer{
    String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(ScoreCard scoreCard) {
        System.out.println("Hello " + name + ", updated score for " + scoreCard.teamName + " is : " + scoreCard.getScore());
    }
}
