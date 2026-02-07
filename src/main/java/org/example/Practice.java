package org.example;

import lombok.Builder;

@Builder
public class Practice {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Practice{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
