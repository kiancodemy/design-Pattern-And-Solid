package org.example.creational.FactoryMethod.factory;

import org.example.creational.FactoryMethod.Notification.Notifications;
import org.example.creational.FactoryMethod.services.EmailNotifications;
import org.example.creational.FactoryMethod.services.SmsNotifications;

public class FactoryMethod {

    public static Notifications createService(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("name is null or blank");
        }
        return switch (name.toLowerCase()) {
            case "sms" -> new SmsNotifications();
            case "email" -> new EmailNotifications();
            default -> throw new RuntimeException("name is illegal");
        };
    }

}

