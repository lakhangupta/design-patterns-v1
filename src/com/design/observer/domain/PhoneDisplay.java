package com.design.observer.domain;

public class PhoneDisplay implements IObserver{

    WeatherStation station;

    public PhoneDisplay(WeatherStation station){
        this.station=station;
    }

    @Override
    public void update() {
        int temp= this.station.getTemperature();
        System.out.println(temp);
    }
}
