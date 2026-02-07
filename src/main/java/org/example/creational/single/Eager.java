package org.example.creational.single;

public class Eager {
    private static final LazyOne instance = new LazyOne();

    public static LazyOne getInstance() {
        return instance;

    };
}
