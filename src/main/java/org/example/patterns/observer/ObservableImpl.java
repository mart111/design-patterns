package org.example.patterns.observer;

import java.util.Arrays;

public class ObservableImpl<T> extends Observable<T> {


    public ObservableImpl() {
        super();
    }

    @Override
    public void update() {
        for (Observer<T> observer : observers) {
            observer.update();
        }
    }

    @Override
    public Observable<T> emit(T... values) {
        data.addAll(Arrays.asList(values));
        update();
        return this;
    }


}
