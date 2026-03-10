/*
Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.



class Employee {

    private int empId;
    private String name;
    private int basicSalary;
    private int da;
    private int hra;

    public Employee(int e, String n, int b, int da, int h) {
        this.empId = e;
        this.name = n;
        this.basicSalary = b;
        this.da = da;
        this.hra = h;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getDa() {
        return da;
    }

    public int getHra() {
        return hra;
    }

    // Gross salary
    public int getGross() {
        return basicSalary + hra + da;
    }
}

public class Q02 {
    public static void main(String[] args) {

        Employee[] employee = {
            new Employee(1, "John", 7800, 100, 500),
            new Employee(2, "Peter", 4500, 200, 100),
            new Employee(3, "Carl", 6000, 100, 500)
        };

        System.out.println("Total Salary:");

        for (Employee e : employee) {
            System.out.println(e.getName() + " = " + e.getGross());
        }
		
		
		System.out.println("Max salary");
		
		for(Employee e : employee){
		   
		}
    }
}
*/

class Employee {
    private int empId;
    private String name;
    private double basicSalary;
    private double hra;
    private double da;

    public Employee(int empId, String name, double basicSalary, double hra, double da) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getBasicSalary() { return basicSalary; }
    public double getHra() { return hra; }
    public double getDa() { return da; }

    public double getGrossSalary() {
        return basicSalary + hra + da;
    }
}

public class Q02 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "John", 30000, 5000, 4000);
        employees[1] = new Employee(2, "Peter", 40000, 6000, 5000);
        employees[2] = new Employee(3, "Carl", 35000, 5500, 4500);
        employees[3] = new Employee(4, "David", 45000, 7000, 6000);
        employees[4] = new Employee(5, "Alex", 28000, 4000, 3500);

        double totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            double gross = employees[i].getGrossSalary();
            totalSalary += gross;
            System.out.println(employees[i].getName() + " = " + gross);
        }

        Employee highest = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getGrossSalary() > highest.getGrossSalary()) {
                highest = employees[i];
            }
        }

        System.out.println("Highest Salary Employee:");
        System.out.println(highest.getName() + " = " + highest.getGrossSalary());

        double avg = totalSalary / employees.length;

        System.out.println("Employees earning above average (" + avg + "):");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getGrossSalary() > avg) {
                System.out.println(employees[i].getName());
            }
        }
    }
}