package org.example.structural.decorator.decorators;

import org.example.structural.decorator.Notification.Notifications;

public class PriorityDecorator extends AbstractDecorator {

    public PriorityDecorator(Notifications notifications) {
        super(notifications);
    }

    @Override
    public void Notifier(String message) {
        String updatedMessage ="Priority "+message;
        super.Notifier(updatedMessage);
        super.Notifier(message);
    }
}
