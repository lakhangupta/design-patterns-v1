package com.design.strategy.domain;

/* A duck class which encapsulates multiple behaviours
    and used in client class to choose which behaviour should be used.
    @author
    lakhangupta
 */

public class Duck {

    private IDisplayBehaviour display;
    private IFlyBehaviour fly;
    private IQuackBehaviour quack;

    public Duck(IDisplayBehaviour d, IFlyBehaviour f, IQuackBehaviour q){
        this.display=d;
        this.fly=f;
        this.quack=q;
    }

    public void fly(){ this.fly.fly(); }

    public void display(){
        this.display.display();
    }

    public void quack(){  this.quack.quack(); }
}
