/*
1) Person → Employee → Manager
Create three classes:
• Person
o name
o age
o displayPerson()

• Employee (inherits Person)
o empId
o salary
o displayEmployee()

• Manager (inherits Employee)
o department
o bonus
o displayManager()
Task: Create an object of Manager and display all details using inherited methods.

*/
import java.util.Scanner;
class Person{
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	public void displayPerson(){
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Age : ");
		age = sc.nextInt();
		System.out.println();
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println();
	}
	
}
class Employee extends Person{
	int empId;
	int salary;
	public void displayEmployee(){
		displayPerson();
		System.out.println("Enter empId : ");
		empId = sc.nextInt();
		System.out.println("Enter salary : ");
		salary = sc.nextInt();
		System.out.println();
		System.out.println("EmpId = "+empId);
		System.out.println("salary = "+salary);
		System.out.println();
	}
}
class Manager extends Employee{
	String department;
	int bonus;
	public void displayManager(){
		displayEmployee();
		System.out.println("Enter department : ");
		department = sc.nextLine();
		System.out.println("Enter bonus : ");
		bonus = sc.nextInt();
		System.out.println();
		System.out.println("department = "+department);
		System.out.println("bonus = "+bonus);
		System.out.println();
	}
}

public class Q01{
	public static void main(String x[]){
	Manager obj = new Manager();
	obj.displayManager();
	}
}