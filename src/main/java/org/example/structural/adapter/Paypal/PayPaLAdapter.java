package org.example.structural.adapter.Paypal;

import org.example.structural.adapter.PaymentProcessor;

import java.math.BigDecimal;

public class PayPaLAdapter implements PaymentProcessor {
    @Override
    public void pay(BigDecimal amount) {
        PayPalSdk payPalSdk = new PayPalSdk();
        payPalSdk.sendPayment(amount,"USD");
    }
}
