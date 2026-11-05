package org.example.Notification;

public class EmailNotification implements NotificationService {
    @Override
    public void Notification() {
        System.out.println("Notification was sent as Email");
    }
}
