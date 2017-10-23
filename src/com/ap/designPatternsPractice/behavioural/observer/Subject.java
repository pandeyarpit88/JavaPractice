package com.ap.designPatternsPractice.behavioural.observer;

/**
 * Created by APandey1 on 21-10-2017.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
