package org.example.Payment;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService {
    @Override
    public void pay(){
        System.out.println("Payment processing through Card");
    }
}
