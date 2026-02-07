package org.example.creational.AbstractFactory.fatcoryMethod;

import org.apache.catalina.User;
import org.example.creational.AbstractFactory.interfaces.EmailNotification;
import org.example.creational.AbstractFactory.interfaces.FactoryInterface;
import org.example.creational.AbstractFactory.interfaces.SmsNotification;
import org.example.creational.AbstractFactory.services.admin.AdminSmsService;
import org.example.creational.AbstractFactory.services.user.UserEmailService;
import org.example.creational.AbstractFactory.services.user.UserSmsService;

public class UserFactory implements FactoryInterface {
    @Override
    public EmailNotification creatEmailNotification() {
        return new UserEmailService();
    }

    @Override
    public SmsNotification creatSmsNotification() {
        return new UserSmsService();
    }
}
