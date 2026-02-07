package org.example.structural.decorator.factory;

import org.example.structural.decorator.Notification.Notifications;
import org.example.structural.decorator.services.EmailNotifications;
import org.example.structural.decorator.services.SmsNotifications;

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

