package org.example.ejercicio2;

public class exercise2 {
    public static void main(String[] args){

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment("credit");
        paymentProcessor.processPayment("paypal");

    }
}
