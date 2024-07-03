package org.example.ejercicio5;

public class PayrollService {
    private Employee employee;
    public PayrollService(Employee employee){
        this.employee = employee;
    }

    public void calculatePay(){
        System.out.println("El salario de " + this.employee.getName() + " es " + this.employee.getSalary()*30);
    }
}
