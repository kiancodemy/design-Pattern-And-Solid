package org.example.structural.bridge.processor;

import java.math.BigDecimal;


public class EuroProcessor implements ProcessorInterface {

    @Override
    public BigDecimal Pay(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal("1.1"));

    }

    @Override
    public String code() {
        return "EUR";
    }
}
