package org.example.structural.adapter;

import java.math.BigDecimal;

public interface PaymentProcessor {
    void pay(BigDecimal amount);
}
