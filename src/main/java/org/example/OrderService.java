package org.example;

import org.example.Notification.NotificationService;
import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    @Autowired @Qualifier("upiPayment")
    ////@Qualifier("upiPayment")The primary and the Qualifier annotation is used to solve the ambiguity problem arrived when 2 same type object is present and spring gets confused which one to inject.
    @Autowired
    PaymentService p1;
//    @Autowired
//    //@Qualifier("smsNotification")
    @Autowired
    NotificationService n1;


//    Dependency injection given using Constructor
//   public OrderService(@Qualifier("upiPayment") PaymentService p1, @Qualifier("emailNotification") NotificationService n1) {
//        this.p1 = p1;
//        this.n1 = n1;
//    }

//    @Autowired
//    @Qualifier("upiPayment")
//    public void setP1(PaymentService p1) {
//        this.p1 = p1;
//    }
//    @Autowired // we need to add this Annotation while doing setter injection as this will tell spring to call this method after creating the objects.
//    @Qualifier("emailNotification")
//    public void setN1(NotificationService n1) {
//        this.n1 = n1;
//    }

    public void placeOrder(){
        System.out.println("Order selected to be placed payment pending");
        p1.pay();
        n1.Notification();
        System.out.println("Order Completed Successfully");

    }


}
