/*
4) Person and Student
Create a class Person with:
• name
• age
Create a subclass Student that:
• Adds marks
• Displays student details and grade.
Task: Calculate grade based on marks.

*/

class Person{
	String name;
	int age;
}

class Student extends Person{
	int marks;
	public void getGrade(){
		if(marks > 90 && marks <= 100){
			System.out.println("A Grade");
		}
		else if(marks > 70 && marks < 90){
			System.out.println("B Grade");
		}
		else if(marks > 60 && marks < 70){
			System.out.println("C Grade");
		}
		else if(marks > 50 && marks < 60){
			System.out.println("D Grade");
		}
		else{
			System.out.println("fail");
		}
	}
}

public class Q04{
	public static void main(String x[]){
		Student obj = new Student();
		obj.name = "Aditya";
		obj.age = 22;
		obj.marks = 85;
		System.out.println("Name = "+obj.name);
		System.out.println("Age = "+obj.age);
		System.out.println("Marks = "+obj.marks);
		obj.getGrade();
	}
}