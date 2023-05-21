package com.design.strategy.domain;

public class JetFlying implements IFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This is Jet Flying.");
    }
}
