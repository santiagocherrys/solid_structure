package org.example.ejercicio3;

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("A trabajar se dijo");
    }

    @Override
    public void eat() {
        System.out.println("Suspendan trabajo, vamos a comer");
    }

    public HumanWorker() {
    }
}
