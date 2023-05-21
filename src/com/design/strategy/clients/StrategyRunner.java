package com.design.strategy.clients;

import com.design.strategy.headfirst.Duck;
import com.design.strategy.headfirst.JetFlying;
import com.design.strategy.headfirst.SimpleDisplay;
import com.design.strategy.headfirst.SimpleQuack;

public class StrategyRunner {

    public static void main(String[] args) {

        Duck duck = new Duck(new SimpleDisplay(), new JetFlying(), new SimpleQuack());

        duck.fly();
        duck.quack();
        duck.display();

    }

}
