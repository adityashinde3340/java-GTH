/*
Q2.Create a POJO class Student with:
rollNo (int)
name (String)
marks (int)


Calculate grade:
Marks ≥ 75 → Grade A
Marks 60–74 → Grade B
Marks 50–59 → Grade C
Below 50 → Fail
Display student details with grade.
Explanation:
Access marks using getter.
Apply grading logic in main method.
Input:
Enter Roll No: 1
Enter Name: Sneha
Enter Marks: 68

Output:
Roll No: 1
Name: Sneha
Marks: 68
Grade: B

*/

import java.util.Scanner;
class Student{
    private int rollNo;
    private	String name;
	private int marks;
	
	public void setRollno(int rollNo){
		this.rollNo = rollNo;
	}
	
	public void setName(String name)(
		this.name = name; 
	)
	
	public void setMarks(int marks){
		this.marks = marks;
	}
	
	public int getRollno(){
		return rollNo;
	}
	
	public int getName(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
	
	public int getGrade(int n){
		if(n >= 75){
			return "Grade A";
		}
		else if(n > 60 && n < 74){
			return "Grade B";
		}
		else if(n > 50 && n < 59){
			return "Grade C";
		}
		else if(n < 50){
			return "Fail";
		}
	}
	
}

public class Q02{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("Enter Roll Number : ");
		std.setRollno(sc.nextInt());
		
		System.out.println("Enter Name : ");
		std.setName(sc.next());
			
		System.out.println("Enter Marks : ");
		std.setMarks(sc.nextInt());
		
		System.out.println(std.getGrade(std.getMarks));
		
		
	}
}
