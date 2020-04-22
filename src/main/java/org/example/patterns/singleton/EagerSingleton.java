package org.example.patterns.singleton;


// this is eager to get approach of singleton instance
// it is thread safe but decrease the performance of program

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
