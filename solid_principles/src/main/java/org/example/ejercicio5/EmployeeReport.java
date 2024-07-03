package org.example.ejercicio5;

public class EmployeeReport {

    private Employee employee;
    public EmployeeReport(Employee employee){
        this.employee = employee;
    }

    public void generateReport(){
        System.out.println("El salario de " + this.employee.getName() + " es " + this.employee.getSalary() + " pero el salario base de un día");
    }
}

