package org.example.ejercicio2;

public class PaymentProcessor {

    public void processPayment(String paymentType){
        if(paymentType.equals("credit")){
            //Lógica para procesar el pago con tarjeta de crédito
            PaymentMethod credictCardPayment = new CreditCardPayment();
            credictCardPayment.processPayment("Credito");
        }else if(paymentType.equals("paypal")){
            //Lógica para procesar el pago con Paypal
            PaymentMethod payPalPayment = new PayPalPayment();
            payPalPayment.processPayment("Paypal");
        }
    }

    public PaymentProcessor() {
    }
}
