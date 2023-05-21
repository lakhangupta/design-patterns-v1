package com.design.strategy.domain;

public class SimpleDisplay implements IDisplayBehaviour{
    @Override
    public void display() {
        System.out.println("This is simple display");
    }
}
