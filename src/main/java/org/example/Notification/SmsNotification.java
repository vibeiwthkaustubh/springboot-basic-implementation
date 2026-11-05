package org.example.Notification;

public class SmsNotification implements NotificationService {

    @Override
    public void Notification() {
        System.out.println("Notification was sent as SMS");
    }
}
