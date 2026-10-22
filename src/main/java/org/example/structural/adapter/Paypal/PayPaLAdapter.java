package org.example.structural.adapter.Paypal;

import org.example.structural.adapter.PaymentProcessor;

import java.math.BigDecimal;

public class PayPaLAdapter implements PaymentProcessor {
    private PayPalSdk payPalSdk;

    public PayPaLAdapter(PayPalSdk payPalSdk) {
        this.payPalSdk = payPalSdk;
    }

    @Override
    public void pay(BigDecimal amount) {
        payPalSdk.sendPayment(amount, "USD");
    }
}
