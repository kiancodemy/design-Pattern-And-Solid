package org.example.creational.AbstractFactory.services.user;

import org.example.creational.AbstractFactory.interfaces.SmsNotification;

public class UserSmsService implements SmsNotification {
    @Override
    public void sendSms() {
        System.out.println("userSmsService sendSms");
    }
}
