package org.example;

import org.example.Notification.NotificationService;
import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    PaymentService p1;
    @Autowired
    NotificationService n1;


    public void placeOrder(){
        System.out.println("Order selected to be placed payment pending");
        p1.pay();
        n1.Notification();
        System.out.println("Order Completed Successfully");

    }


}
