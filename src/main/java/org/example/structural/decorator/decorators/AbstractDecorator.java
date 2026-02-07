package org.example.structural.decorator.decorators;

import lombok.RequiredArgsConstructor;
import org.example.structural.decorator.Notification.Notifications;

@RequiredArgsConstructor
public  class AbstractDecorator implements Notifications {
    private final Notifications notifications;

    @Override
    public void Notifier(String message) {
        notifications.Notifier(message);


    }
}
