package org.example.structural.bridge.card;

import org.example.structural.bridge.processor.ProcessorInterface;
import org.example.structural.bridge.sdk.SdkInterface;

import java.math.BigDecimal;

//before paying we use this bridge to connect and make some change to price like tax and .... ///

public class PaypalCard extends PayAbstraction {


    public PaypalCard(ProcessorInterface processorInterface, SdkInterface sdkInterface) {
        super(processorInterface, sdkInterface);
    }

    private void connection() {
        System.out.println("connected to paypal");
        try {
            Thread.sleep(1000);
            System.out.println("finished delay");
        } catch (InterruptedException e) {
            throw new RuntimeException("fuck");
        }
    }


    @Override
    public void pay(BigDecimal bigDecimal) {
        connection();
        String code = processorInterface.code();
        BigDecimal pay = processorInterface.Pay(bigDecimal);
        sdkInterface.send(pay, code);


    }
}
