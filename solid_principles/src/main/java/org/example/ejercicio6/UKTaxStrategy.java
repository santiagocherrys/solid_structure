package org.example.ejercicio6;

public class UKTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax() {
        //Lógica para calcular el impuesto en UK
        return 0.2;
    }

    public UKTaxStrategy() {
    }
}
