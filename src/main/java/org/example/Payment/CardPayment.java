package org.example.Payment;

public class CardPayment implements PaymentService {
    @Override
    public void pay(){
        System.out.println("Payment processing through Card");
    }
}
