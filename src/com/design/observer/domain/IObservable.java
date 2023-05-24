package com.design.observer.domain;

public interface IObservable {

    public void add(IObserver observer);

    public void remove (IObserver observer);

    public void notified();
}
