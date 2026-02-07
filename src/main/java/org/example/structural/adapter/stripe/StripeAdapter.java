package org.example.structural.adapter.stripe;

import org.example.structural.adapter.PaymentProcessor;

import java.math.BigDecimal;

public class StripeAdapter implements PaymentProcessor {
    @Override
    public void pay(BigDecimal amount) {
        StripeSdk stripeSdk = new StripeSdk();
        stripeSdk.sendPayment(amount,"EUR");

    }
}
