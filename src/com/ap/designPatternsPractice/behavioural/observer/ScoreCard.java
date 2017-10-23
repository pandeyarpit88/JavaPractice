package com.ap.designPatternsPractice.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APandey1 on 21-10-2017.
 */
public class ScoreCard implements Subject{
    List<Observer> observers = new ArrayList<>();
    String teamName;
    int score;

    public ScoreCard(String teamName){
        this.teamName = teamName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this);
    }
}
