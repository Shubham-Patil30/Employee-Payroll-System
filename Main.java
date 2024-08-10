package project;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee " + "Name: " + name + " Id:" + id + " salary:" + calculateSalary();
    }

    abstract public double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hourlyWork;
    private double hourlySal;

    public PartTimeEmployee(String name, int id, int hourlyWork, double hourlySal) {
        super(name, id);
        this.hourlyWork = hourlyWork;
        this.hourlySal = hourlySal;
    }

    @Override
    public double calculateSalary() {
        return hourlySal * hourlyWork;
    }
}

class PayrollSystem {
    List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employToRemove = null;

        for (Employee employee : employeeList) {
            if(employee.getId() == id){
              employToRemove = employee; 
              break;
            }
        }
        if(employToRemove != null){
            employeeList.remove(employToRemove);
        }

    }
    public void employeeDetails(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem(); 
        
        FullTimeEmployee emp1 = new FullTimeEmployee("shubh", 01,1000 );
        PartTimeEmployee emp2 = new PartTimeEmployee("sid", 02, 30, 200);
        PartTimeEmployee emp3 = new PartTimeEmployee("rahul", 03, 25, 200);

        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp3);


        System.out.println("Employee datails ");

        payrollSystem.employeeDetails();

        payrollSystem.removeEmployee(3);
        System.out.println("removing Employeee id 3......");

        payrollSystem.employeeDetails();



    }
}
