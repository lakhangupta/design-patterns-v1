package com.design.decorator.client;

import com.design.decorator.domain.Beverage;
import com.design.decorator.domain.Caramel;
import com.design.decorator.domain.Espresso;

public class DecoratorRunner {

    public static void main(String[] args) {
        Beverage beverage = new Caramel(new Espresso());
        int cost = beverage.cost();
        System.out.println(cost);
    }
}
