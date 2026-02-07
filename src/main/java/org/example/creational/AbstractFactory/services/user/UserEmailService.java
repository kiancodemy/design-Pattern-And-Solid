package org.example.creational.AbstractFactory.services.user;

import org.example.creational.AbstractFactory.interfaces.EmailNotification;

public class UserEmailService implements EmailNotification {
    @Override
    public void sendEmail() {
        System.out.println("userEmailService sendEmail");
    }
}
