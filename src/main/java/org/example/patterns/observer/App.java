package org.example.patterns.observer;

public class App {

    public static void main(String[] args) {
        Observable<String> observable = new ObservableImpl<>();
        Observer1<String> observer1 = new Observer1<>(observable);
        Observer2<String> observer2 = new Observer2<>(observable);
        observable.emit("A", "B");
        observer1.onSubscribe(System.out::println);
        observer2.onSubscribe(System.out::println);
    }
}
