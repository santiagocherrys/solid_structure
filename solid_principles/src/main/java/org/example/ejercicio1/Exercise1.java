package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args){
        List<String> items = new ArrayList<>();
        items.add("Banano");
        items.add("Pera");
        items.add("Maracuya");
        items.add("Coconut");

        Order order = new Order(items, 2.5);

        PrintOrder printOrder = new PrintOrder();

        printOrder.printOrder(order);

        SaveToDatabase saveToDatabase = new SaveToDatabase();

        List<String> newItems = new ArrayList<>();
        newItems.add("Sapote");
        newItems.add("Uva");
        newItems.add("Mango");
        newItems.add("Mora");

        saveToDatabase.saveToDatabase(order, newItems, 3.0);


        printOrder.printOrder(order);

        OrderCalculateTotal orderCalculateTotal = new OrderCalculateTotal();

        System.out.println(" El valor total de la orden es: " + orderCalculateTotal.calculateTotal(order));
    }
}
