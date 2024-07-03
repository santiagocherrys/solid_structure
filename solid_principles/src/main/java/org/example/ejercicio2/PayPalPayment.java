package org.example.ejercicio2;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void processPayment(String paymentType) {
        System.out.println("Este pago es hecho con " + paymentType);
    }

    public PayPalPayment() {
    }
}
