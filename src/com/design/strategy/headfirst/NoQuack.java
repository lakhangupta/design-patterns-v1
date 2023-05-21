package com.design.strategy.headfirst;

public class NoQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("THis is no quack");
    }
}
