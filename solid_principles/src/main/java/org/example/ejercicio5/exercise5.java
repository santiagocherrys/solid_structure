package org.example.ejercicio5;

public class exercise5 {
    public static Employee employee = new Employee("Ramiro",250);
    public static void main(String[] args){

        PayrollService payrollService = new PayrollService(employee);
        EmployeeReport employeeReport = new EmployeeReport(employee);
        EmployeeRepository employeeRepository = new EmployeeRepository(employee);
        payrollService.calculatePay();
        employeeReport.generateReport();
        employee.setSalary(100);
        employee.setName("Adriana");
        employeeRepository.saveToDatabase(employee);
        employeeReport.generateReport();


    }
}
