package com.poc.design.patterns.strategy.order.notifyer;

public class SMSNotificationStrategy implements NotificationStrategy {

    @Override
    public void notify(String message) {
        System.out.println("Sending SMS...\n" + message);
    }

}
