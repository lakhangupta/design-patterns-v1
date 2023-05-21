package com.design.strategy.domain;

public class NoQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("THis is no quack");
    }
}
