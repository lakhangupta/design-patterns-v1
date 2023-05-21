package com.design.strategy.headfirst;

public class SimpleQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("THis is simpleQuack");
    }
}
