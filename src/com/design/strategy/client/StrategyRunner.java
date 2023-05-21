package com.design.strategy.client;

import com.design.strategy.domain.Duck;
import com.design.strategy.domain.JetFlying;
import com.design.strategy.domain.SimpleDisplay;
import com.design.strategy.domain.SimpleQuack;

public class StrategyRunner {

    public static void main(String[] args) {

        Duck duck = new Duck(new SimpleDisplay(), new JetFlying(), new SimpleQuack());

        duck.fly();
        duck.quack();
        duck.display();

    }

}
