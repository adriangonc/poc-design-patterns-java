package com.poc.design.patterns.strategy.order.notifyer;

public class EmailNotificationStrategy implements NotificationStrategy {

    @Override
    public void notify(String message) {
        System.out.println("Sending email...\n" + message);
    }

}
