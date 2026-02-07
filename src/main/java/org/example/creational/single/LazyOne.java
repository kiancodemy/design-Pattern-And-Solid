package org.example.creational.single;

public class LazyOne {
    private static  LazyOne instance;

    public static LazyOne getInstance() {
        if (instance == null) {
            instance = new LazyOne();
        }
        return instance;
    }
}
