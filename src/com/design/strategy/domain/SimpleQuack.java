package com.design.strategy.domain;

public class SimpleQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("THis is simpleQuack");
    }
}
