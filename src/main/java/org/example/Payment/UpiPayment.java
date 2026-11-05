package org.example.Payment;

import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Payment processing through UPI");
    }
}
