package com.vedatdemirdev.listener;

import com.vedatdemirdev.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class NotificationListener {

    @RabbitListener(queues = "vedo-queue")
    public void handleMessage(Notification notification) {
        System.out.println("Message arrived");
        System.out.println(notification.toString());
    }
}
