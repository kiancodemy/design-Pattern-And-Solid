package org.example.structural.bridge.card;

import org.example.structural.adapter.Paypal.PayPalSdk;
import org.example.structural.bridge.processor.ProcessorInterface;
import org.example.structural.bridge.sdk.SdkInterface;

import java.math.BigDecimal;

public abstract class PayAbstraction {
    protected ProcessorInterface processorInterface;
    protected SdkInterface sdkInterface;

    public PayAbstraction(ProcessorInterface processorInterface, SdkInterface sdkInterface) {
        this.processorInterface = processorInterface;
        this.sdkInterface = sdkInterface;
    }

    public abstract void pay(BigDecimal bigDecimal);
}
