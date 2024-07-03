package org.example.ejercicio1;

import java.util.List;

public class ExerciseOrder {
    private List<String> items;
    private double totalAmount;

    public ExerciseOrder(List<String> items){
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal(){
        //Lógica para calcular el total de la orden
        return 100.0;  //simplificado
    }

    public void printOrder(){
        //Lógica para impimir la orden
    }

    public void saveToDatabase(){
        //Lógica para guardar la orden en la base de datos
    }
}
