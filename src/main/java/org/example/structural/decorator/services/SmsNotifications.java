package org.example.structural.decorator.services;

import org.example.structural.decorator.Notification.Notifications;

public class SmsNotifications implements Notifications {

    @Override
    public void Notifier(String message) {
        System.out.println(message);
    }
}
