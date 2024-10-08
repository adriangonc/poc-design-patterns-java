package com.poc.design.patterns.strategy;

import com.poc.design.patterns.strategy.order.notifyer.EmailNotificationStrategy;
import com.poc.design.patterns.strategy.order.notifyer.OrderNotifier;
import com.poc.design.patterns.strategy.order.notifyer.SMSNotificationStrategy;
import com.poc.design.patterns.strategy.order.notifyer.WebHookNotificationStrategy;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Strategy {
    public static void main(String[] args){

        List<String> notificationChannelList = List.of("EMAIL", "WEBHOOK", "SMS");
        Random random = new Random();
        String channel = notificationChannelList.get(random.nextInt(notificationChannelList.size()));


        OrderNotifier orderNotifier = new OrderNotifier();

        if (channel == "EMAIL"){
            orderNotifier.setNotificationStrategy(new EmailNotificationStrategy());
        } else if (channel == "WEBHOOK") {
            orderNotifier.setNotificationStrategy(new WebHookNotificationStrategy());
        } else if (channel == "SMS") {
            orderNotifier.setNotificationStrategy(new SMSNotificationStrategy());
        }


        orderNotifier.notify("Compra 001 enviada em: \n" + new Date());
    }
}
