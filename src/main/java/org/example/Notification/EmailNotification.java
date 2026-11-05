package org.example.Notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements NotificationService {
    @Override
    public void Notification() {
        System.out.println("Notification was sent as Email");
    }
}
