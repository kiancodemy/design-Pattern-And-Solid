package org.example.structural.adapter;

import java.math.BigDecimal;

public class DemoProcessor implements PaymentProcessor {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("the amount is " + amount + "and we dont need any more currency mode");
    }
}
