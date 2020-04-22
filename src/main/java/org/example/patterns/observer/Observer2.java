package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Observer2<T> implements Observer<T> {

    private final Observable<T> observable;
    private final List<T> data;

    public Observer2(Observable<T> observable) {
        this.observable = observable;
        this.observable.subscribe(this);
        this.data = new ArrayList<>();
    }

    @Override
    public void update() {
        this.data.addAll(observable.data);
    }

    public void onSubscribe(Consumer<T> action) {
        for (T item : this.data) {
            action.accept(item);
        }
    }
}
