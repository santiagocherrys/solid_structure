package org.example.ejercicio6;

public class TaxCalculator {
    private TaxStrategy usaTaxStrategy = new USATaxStrategy();
    private TaxStrategy ukTaxStrategy = new UKTaxStrategy();

    public double calculateTaxUSA(){
        return usaTaxStrategy.calculateTax();
    }

    public double calculateTaxUK(){
        return ukTaxStrategy.calculateTax();
    }

    public TaxCalculator() {
    }
}
