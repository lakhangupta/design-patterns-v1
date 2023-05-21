package com.design.strategy.domain;

public class SimpleFlying implements IFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This is simple flying.");
    }
}
