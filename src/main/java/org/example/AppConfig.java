package org.example;

import org.example.Payment.PaymentService;
import org.example.Payment.UpiPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example")
public class AppConfig {
    @Bean
     public PaymentService upiPayment(){
         return new UpiPayment();
     }





}
