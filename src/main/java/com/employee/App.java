
package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("\n================================");
            System.out.println("    EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = Double.parseDouble(sc.nextLine());

                    employees.add(new Employee(
                            id, name, email, department, salary));

                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee emp : employees) {
                            System.out.println("\nID: " + emp.getId());
                            System.out.println("Name: " + emp.getName());
                            System.out.println("Email: " + emp.getEmail());
                            System.out.println("Department: " + emp.getDepartment());
                            System.out.println("Salary: " + emp.getSalary());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = Integer.parseInt(sc.nextLine());

                    boolean found = false;

                    for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("Name: " + emp.getName());
                            System.out.println("Email: " + emp.getEmail());
                            System.out.println("Department: " + emp.getDepartment());
                            System.out.println("Salary: " + emp.getSalary());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    boolean updated = false;

                    for (Employee emp : employees) {
                        if (emp.getId() == updateId) {
                            System.out.print("Enter New Salary: ");
                            double newSalary = Double.parseDouble(sc.nextLine());

                            emp.setSalary(newSalary);
                            System.out.println("Salary updated successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    boolean deleted = employees.removeIf(
                            emp -> emp.getId() == deleteId);

                    if (deleted) {
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using Employee Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
