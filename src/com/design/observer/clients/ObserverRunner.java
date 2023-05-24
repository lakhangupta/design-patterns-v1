package com.design.observer.clients;

import com.design.observer.domain.PhoneDisplay;
import com.design.observer.domain.WeatherStation;

public class ObserverRunner {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay(station);
        station.add(phone);
        station.setTemperature();
       // int temp = phone.update();
       // System.out.println(temp);
    }
}
