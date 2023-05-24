package com.design.observer.domain;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    List<IObserver> observers = new ArrayList<>();
    int temperature = 50;

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    //if there is any change in temperature, we will notify all observers
    @Override
    public void notified() {
        for(IObserver observer : observers){
            observer.update();
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(){

        for(int i=1; i<5; i++){
            temperature = temperature * i;
            notified();
        }



    }
}
