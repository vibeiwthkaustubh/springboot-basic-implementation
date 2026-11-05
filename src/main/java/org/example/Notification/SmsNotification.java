package org.example.Notification;

import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements NotificationService {

    @Override
    public void Notification() {
        System.out.println("Notification was sent as SMS");
    }
}
