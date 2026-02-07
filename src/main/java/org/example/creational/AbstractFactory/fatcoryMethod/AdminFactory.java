package org.example.creational.AbstractFactory.fatcoryMethod;

import org.example.creational.AbstractFactory.interfaces.EmailNotification;
import org.example.creational.AbstractFactory.interfaces.FactoryInterface;
import org.example.creational.AbstractFactory.interfaces.SmsNotification;
import org.example.creational.AbstractFactory.services.admin.AdminEmailService;
import org.example.creational.AbstractFactory.services.admin.AdminSmsService;

public class AdminFactory implements FactoryInterface {
    @Override
    public EmailNotification creatEmailNotification() {
        return new AdminEmailService();
    }

    @Override
    public SmsNotification creatSmsNotification() {
        return new AdminSmsService();
    }
}
