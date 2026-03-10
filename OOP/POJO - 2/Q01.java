/*
Q1. Create a POJO class Employee with the following fields:
empId (int)
name (String)
salary (double)
experience (int – in years)
Calculate bonus based on experience:
Experience ≥ 5 years → 10% bonus
Experience < 5 years → 5% bonus
Display employee details along with bonus amount and final salary.
*/

import java.util.Scanner;
class Employee{
	private int empId;
	private String name;
	private double salary;
	private int experience;
	
	
	public void setEmpid(int empId){
		this.empId = empId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public void setExperience(int experience){
		this.experience = experience;
	}
	
	public int getEmpid(){
		return empId;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getExperience(){
		return experience;
	}
	
	
	
}

public class Q01{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	
	System.out.println("Enter Empid : ");
	emp.setEmpid(sc.nextInt());
	
	System.out.println("Enter Name : ");
	emp.setName(sc.next());
	
    System.out.println("Enter Salary : ");
	emp.setSalary(sc.nextDouble());
	
	System.out.println("Enter Experience : ");
	emp.setExperience(sc.nextInt());
	
	double bounus = 0;
	
	if(emp.getExperience() > 5){
		bounus = emp.getSalary() + (emp.getSalary() * 10) / 100;
	}
	
	System.out.println("EmpId = "+emp.getEmpid());
	System.out.println("Name = "+emp.getName());
	System.out.println("Original salary = "+emp.getSalary());
	System.out.println("Experience = "+emp.getExperience());
	System.out.println("Bouns = "+bounus);
	
	}
}