package org.example.structural.adapter.stripe;

import org.example.structural.adapter.PaymentProcessor;

import java.math.BigDecimal;

public class StripeAdapter implements PaymentProcessor {
    private StripeSdk stripeSdk;

    public StripeAdapter(StripeSdk stripeSdk) {
        this.stripeSdk = stripeSdk;
    }

    @Override
    public void pay(BigDecimal amount) {

        stripeSdk.sendPayment(amount, "EUR");

    }
}
