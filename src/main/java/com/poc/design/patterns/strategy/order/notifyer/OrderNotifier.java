package com.poc.design.patterns.strategy.order.notifyer;

public class OrderNotifier {

    private NotificationStrategy notificationStrategy;

    public void setNotificationStrategy(NotificationStrategy notificationStrategy){
        this.notificationStrategy = notificationStrategy;
    }

    public void notify(String message){
        if (notificationStrategy != null){
            notificationStrategy.notify(message);
        } else {
            throw new IllegalArgumentException("Notification strategy not set");
        }
    }


}