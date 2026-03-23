/*
Q1. Create a Student class with fields: name, marks.
 Use a parameterized constructor to initialize both fields.
 Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
 Create 3 student objects and print their results.
Concepts Used:
 ✔ Parameterized constructor
 ✔ If–else logic
Explanation:
The constructor sets the student’s name and marks.
Then you apply simple logical condition (≥ 35).

*/
import java.util.Scanner;
class Student{
	Scanner sc = new Scanner(System.in);
	String name = "default";
	int marks = "0";
	
	
	Student(String name , int marks){
		System.out.println("enter your name : ");
		name = sc.nextLine();
		System.out.println("Enter your marks:");
		marks = sc.nextInt();
	}
	
	void checkResult(){
		if(marks >= 35){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
	
}


public class Q01{
	public static void main(String x[]){
	Student obj = new Student();
	obj.checkResult();
	}
		
}