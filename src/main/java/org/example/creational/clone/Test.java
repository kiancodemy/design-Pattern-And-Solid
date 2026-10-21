package org.example.creational.clone;

public class Test implements Cloneable {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public Test clone() {
        try {
            return (Test) super.clone();   // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e.getMessage()); // can't happen — we implement Cloneable
        }

}
}