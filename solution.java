
import java.util.*;
class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

 
    public String getDesignation() {
        return designation;
    }

  
    public int getId() {
        return id;
    }

 
    public String getName() {
        return name;
    }
}



class Company {
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = employees.length;
    }

    public double getAverageSalary() {
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total / numEmployees;
    }

    public double getMaxSalary() {
        double max = employees[0].getSalary();
        for (Employee e : employees) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        return max;
    }

 
    public Employee[] getEmployeesByDesignation(String designation) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getDesignation().equalsIgnoreCase(designation)) {
                result.add(e);
            }
        }
        return result.toArray(new Employee[0]); 
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read company name
        System.out.print("Enter company name: ");
        String companyName = sc.nextLine();

        // Read number of employees
        System.out.print("Enter number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create Employee array
        Employee[] employees = new Employee[numEmployees];

        // Read details for each employee
        System.out.println("Enter employee details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Create and store employee object
            employees[i] = new Employee(id, name, designation, salary);
        }

        // Create Company object
        Company company = new Company(companyName, employees);

        // Print average salary
        System.out.println("Average salary: " + company.getAverageSalary());

        // Print max salary
        System.out.println("Max salary: " + company.getMaxSalary());

        // Read designation to search
        System.out.print("Enter designation to search: ");
        String searchDesignation = sc.nextLine();

        // Get employees with the given designation
        Employee[] filteredEmployees = company.getEmployeesByDesignation(searchDesignation);

        // Print employees with given designation
        if (filteredEmployees.length > 0) {
            System.out.println("Employees with designation: " + searchDesignation);
            for (Employee e : filteredEmployees) {
                System.out.println("ID: " + e.getId() + ", Name: " + e.getName() +
                        ", Designation: " + e.getDesignation() +
                        ", Salary: " + e.getSalary());
            }
        } else {
            System.out.println("No employees found with designation: " + searchDesignation);
        }
    }
}