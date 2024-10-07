package com.poc.design.patterns.strategy.order.notifyer;

import com.poc.design.patterns.strategy.NotificationType;

public class OrderNotifyer {
    public void nofity(NotificationType notificationType, String message){

        if (notificationType.equals(NotificationType.EMAIL)){
            System.out.println("Sending email... \n" + message);
        } else if (notificationType.equals(NotificationType.SMS)) {
            System.out.println("Sending SMS...\n" + message);
        }

    }
}