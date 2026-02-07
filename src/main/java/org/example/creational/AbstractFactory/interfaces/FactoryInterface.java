package org.example.creational.AbstractFactory.interfaces;

public interface FactoryInterface {
    EmailNotification creatEmailNotification();

    SmsNotification creatSmsNotification();
}
