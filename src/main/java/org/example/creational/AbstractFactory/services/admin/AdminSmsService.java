package org.example.creational.AbstractFactory.services.admin;

import org.example.creational.AbstractFactory.interfaces.SmsNotification;

public class AdminSmsService implements SmsNotification {
    @Override
    public void sendSms() {
        System.out.println("AdminSmsService sendSms");
    }
}
