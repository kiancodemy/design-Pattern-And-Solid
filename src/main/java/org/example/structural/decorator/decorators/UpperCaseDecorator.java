package org.example.structural.decorator.decorators;

import org.example.structural.decorator.Notification.Notifications;

public class UpperCaseDecorator extends AbstractDecorator {
    public UpperCaseDecorator(Notifications notifications) {
        super(notifications);
    }

    @Override
    public void Notifier(String message) {
        String updatedMessage = message.toUpperCase();
        super.Notifier(updatedMessage);
    }
}
