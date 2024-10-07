package com.poc.design.patterns.strategy.order.notifyer;

public class WebHookNotificationStrategy implements NotificationStrategy {

    @Override
    public void notify(String message) {
        System.out.println("Sending Web Hook...\n" + message);
    }

}
