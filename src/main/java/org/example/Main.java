package org.example;

import org.example.structural.bridge.card.PaypalCard;
import org.example.structural.bridge.processor.UsdProcessor;
import org.example.structural.bridge.sdk.PaypalSdk;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaypalCard paypalCard = new PaypalCard(new UsdProcessor(), new PaypalSdk());
        paypalCard.pay(new BigDecimal("23.1111"));
    }
}