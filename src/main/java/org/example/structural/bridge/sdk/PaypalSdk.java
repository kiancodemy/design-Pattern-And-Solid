package org.example.structural.bridge.sdk;

import java.math.BigDecimal;

public class PaypalSdk implements SdkInterface{

    @Override
    public void send(BigDecimal a, String code) {
        String sentence = String.format("final amount  is %s and code is %s", a, code);
        System.out.println(sentence);
    }
}
