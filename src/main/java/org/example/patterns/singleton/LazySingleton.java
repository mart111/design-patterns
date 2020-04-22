package org.example.patterns.singleton;

public class LazySingleton {

    private static volatile LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        if (singleton == null) {
            // synchronizing the class rather than the object because the
            // instance belongs to Class.
            synchronized (LazySingleton.class) {
                singleton = new LazySingleton();
            }
        }

        return singleton;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
