package org.example.Payment;

public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Payment processing through UPI");
    }
}
