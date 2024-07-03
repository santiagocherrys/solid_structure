package org.example.ejercicio1;

public class PrintOrder {
    public void printOrder(Order order){
        System.out.println("La orden tiene los siguientes items " + order.getItems() + " y su cantiad es " + order.getTotalAmount());
    }

    public PrintOrder() {
    }
}
