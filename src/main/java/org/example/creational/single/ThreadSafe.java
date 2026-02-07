package org.example.creational.single;

public class ThreadSafe {
    private static  LazyOne instance;

    public synchronized static LazyOne getInstance() {
        if (instance == null) {
            instance = new LazyOne();
        }
        return instance;
    }
}
