package org.example.behavorial.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int number;


    private List<Observer> subscribers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        this.notifyAllSubscribers();
    }

    public  void subscribe(Observer observer){
        this.subscribers.add(observer);
    }
    public void notifyAllSubscribers(){
        for (Observer observer : subscribers) {
            observer.update();
            }
        }
    }

