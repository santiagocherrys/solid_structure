package org.example.ejercicio6;

public class exercise6 {

    public static void main(String[] args){
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println("Este es el task de UK");
        System.out.println(taxCalculator.calculateTaxUK());

        System.out.println("");
        System.out.println("Este es el task de USA");
        System.out.println(taxCalculator.calculateTaxUSA());
    }



}
