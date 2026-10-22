package org.example.structural.bridge.processor;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsdProcessor implements ProcessorInterface {

    @Override
    public BigDecimal Pay(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal("1.2")).setScale(0, RoundingMode.HALF_UP);
    }

    @Override
    public String code() {
        return "USD";
    }
}
