package org.example.ejercicio2;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(String paymentType) {
        System.out.println("Este pago es con tarjeta de " + paymentType);
    }

    public CreditCardPayment() {
    }
}
