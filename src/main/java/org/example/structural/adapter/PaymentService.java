package org.example.structural.adapter;

import java.math.BigDecimal;

public class PaymentService {
    public void processPayment(PaymentProcessor paymentProcessor, BigDecimal amount) {
        paymentProcessor.pay(amount);
    }

}
