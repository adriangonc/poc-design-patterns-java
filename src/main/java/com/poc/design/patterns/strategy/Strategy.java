package com.poc.design.patterns.strategy;

import com.poc.design.patterns.strategy.order.notifyer.OrderNotifyer;

import java.util.Date;

public class Strategy {
    public static void main(String[] args){
        OrderNotifyer orderNotifyer = new OrderNotifyer();
        orderNotifyer.nofity(NotificationType.SMS, "Compra enviada em: " + new Date().toInstant().toString());
    }
}
