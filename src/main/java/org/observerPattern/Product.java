package org.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Product    implements Subject {

    private String name;
    private String availability;

    private List<Observer> observerList;
    public Product(String name) {
        this.name = name;
        this.observerList=new ArrayList<>();
    }
    @Override
    public void add(Observer observer) {
       observerList.add(observer);
    }
    @Override
    public void remove(Observer observer) {
     observerList.remove(observer);
    }
    @Override
    public void notifyAllObservers() {
     for (Observer observer: observerList){
         observer.update(availability);
     }
    }

    public void setAvailability(boolean available) {
        availability= this.name +(available ? " Available": "Not available");
        notifyAllObservers();
    }
}
