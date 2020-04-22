package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {

    protected List<Observer<T>> observers;

    protected List<T> data;

    protected Observable() {
        observers = new ArrayList<>();
        data = new ArrayList<>();
    }

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    abstract void update();

    public abstract Observable<T> emit(T... values);
}
