package org.example.creational.FactoryMethod.services;

import org.example.creational.FactoryMethod.Notification.Notifications;

public class EmailNotifications implements Notifications {

    @Override
    public void Notifier() {
        System.out.println("Email Notifications");
    }
}
