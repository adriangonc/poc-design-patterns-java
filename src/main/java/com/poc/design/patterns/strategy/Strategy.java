package com.poc.design.patterns.strategy;

import com.poc.design.patterns.strategy.order.notifyer.EmailNotificationStrategy;
import com.poc.design.patterns.strategy.order.notifyer.OrderNotifier;
import com.poc.design.patterns.strategy.order.notifyer.WebHookNotificationStrategy;

import java.util.Date;

public class Strategy {
    public static void main(String[] args){
        OrderNotifier orderNotifier = new OrderNotifier();
        orderNotifier.setNotificationStrategy(new WebHookNotificationStrategy());
        orderNotifier.notify("Compra 001 enviada em: \n" + new Date());
    }
}
