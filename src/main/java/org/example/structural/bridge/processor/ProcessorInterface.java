package org.example.structural.bridge.processor;

import java.math.BigDecimal;

public interface ProcessorInterface {
    BigDecimal Pay(BigDecimal bigDecimal);
    String code();
}
