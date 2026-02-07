package org.example.creational.AbstractFactory.services.admin;

import org.example.creational.AbstractFactory.interfaces.EmailNotification;

public class AdminEmailService implements EmailNotification {
    @Override
    public void sendEmail() {
        System.out.println("AdminEmailService sendEmail");
    }
}
