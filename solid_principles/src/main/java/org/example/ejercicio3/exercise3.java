package org.example.ejercicio3;

public class exercise3 {

    public static void main(String[] args){

        System.out.println("Esto es un trabajador humano");
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.work();
        humanWorker.eat();

        System.out.println("\n Este es el trabajodor robot");
        RobotWorker robotWorker = new RobotWorker();
        robotWorker.work();
    }
}
