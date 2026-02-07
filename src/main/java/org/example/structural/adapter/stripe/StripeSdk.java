package org.example.structural.adapter.stripe;

import java.math.BigDecimal;

public class StripeSdk {

    public void sendPayment(BigDecimal amount, String currency) {
        System.out.printf("the amount is %f and the currency is %s", amount, currency);
    }
}
