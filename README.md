# Employee Payroll System

This project is a simple Employee Payroll System implemented in Java using Object-Oriented Programming (OOP) principles. The system allows managing a list of employees, both full-time and part-time, and calculating their salaries based on their respective payment models.

## Features

- **Employee Management**: Add and remove employees from the payroll system.
- **Full-Time and Part-Time Employees**: The system supports two types of employees:
  - **Full-Time Employees**: Paid a fixed monthly salary.
  - **Part-Time Employees**: Paid based on the number of hours worked and their hourly rate.
- **Salary Calculation**: The system automatically calculates and displays the salary for each employee.
- **Employee Details**: View a summary of all employees, including their names, IDs, and calculated salaries.

## Project Structure

- **Employee (Abstract Class)**: The base class representing an employee, containing common properties like `name` and `id`. It includes an abstract method `calculateSalary()` that is implemented by derived classes.
- **FullTimeEmployee (Class)**: Inherits from `Employee` and represents a full-time employee with a fixed monthly salary.
- **PartTimeEmployee (Class)**: Inherits from `Employee` and represents a part-time employee paid based on hours worked and hourly wage.
- **PayrollSystem (Class)**: Manages the list of employees and provides functionality to add, remove, and display employee details.
- **Main (Class)**: The entry point of the application, demonstrating the usage of the payroll system.

## How to Run

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files using `javac`.
4. Run the `Main` class to see the payroll system in action.

## Example Usage

```java
PayrollSystem payrollSystem = new PayrollSystem(); 

FullTimeEmployee emp1 = new FullTimeEmployee("Shubh", 01, 1000 );
PartTimeEmployee emp2 = new PartTimeEmployee("Sid", 02, 30, 200);
PartTimeEmployee emp3 = new PartTimeEmployee("Rahul", 03, 25, 200);

payrollSystem.addEmployee(emp2);
payrollSystem.addEmployee(emp1);
payrollSystem.addEmployee(emp3);

payrollSystem.employeeDetails();

payrollSystem.removeEmployee(3);
payrollSystem.employeeDetails();
