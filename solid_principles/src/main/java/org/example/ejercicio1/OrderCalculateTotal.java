package org.example.ejercicio1;

public class OrderCalculateTotal {
    public double calculateTotal(Order order){
        System.out.print("La orden es: " + order.getItems());
        //Esta lógica no tiene sentido pero es para hacer algo
        return order.getTotalAmount()*10;
    }

    public OrderCalculateTotal() {
    }
}
