package org.example.ejercicio6;

public class USATaxStrategy implements TaxStrategy{
    @Override
    public double calculateTax() {
        //ógica para calcular el impueto en USA
        return 0.1;
    }

    public USATaxStrategy() {
    }
}
