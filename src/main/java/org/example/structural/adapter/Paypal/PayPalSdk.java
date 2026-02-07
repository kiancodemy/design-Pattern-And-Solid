package org.example.structural.adapter.Paypal;

import java.math.BigDecimal;

public class PayPalSdk {

    public void sendPayment(BigDecimal amount, String currency) {
        System.out.printf("the amount is %.2f and the currency is %s",amount,currency);
    }
}
