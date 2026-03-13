/*
1) Employee Salary Calculation
Create a class Employee with:
  • name
  • basicSalary
Create a subclass Manager that:
    • Adds bonus
    • Calculates total salary
    Task: Write a program to display employee name and total salary.

*/


class Employee{
	String name;
	int basicSalary;
}

class Manager extends Employee{
    int bonus = 2000;
	int total;
	public void getTotal(){
		total = basicSalary + bonus;
	}
	
}

public class Q01{
	
	public static void main(String x[]){
			Manager mgr = new Manager();
			mgr.name = "aditya";
			mgr.basicSalary = 40000;
			mgr.bonus = 2000;
			mgr.getTotal();
			System.out.println("Name = "+mgr.name);
			System.out.println("Total Salary = "+mgr.total);
	}
	
	
}