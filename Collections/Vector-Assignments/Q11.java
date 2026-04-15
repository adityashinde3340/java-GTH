/*
Q11. Create a POJO class Student with fields:
id
name
marks
Store 5 students in a Vector and display students who scored more than 60 marks.
Description
Program should:
Create Student class with getters/setters
Store objects in Vector
Apply condition marks > 60
Display qualified students
Input
101 Rahul 55 
102 Amit 78 
103 Neha 88 
104 Pooja 45 
105 Kiran 67

*/
import java.util.*;
class Student{
  private int id;
  private String name;
  private int marks;
  
  public Student(int id , String name, int marks){
    this.id = id;
    this.name = name;
    this.marks = marks;
  }
  
  public void setId(int id){
     this.id = id;
  }
  public int getId(){
    return id;
  }
  
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  
  public void setMarks(int marks){
     this.marks = marks;
  }
  public int getMarks(){
     return marks;
  }
  
}
public class Q11{
   public static void main(String x[]){
   Vector<Object> v1 = new Vector<>();
   
   Student st = new Student( 01 , "Aditya" , 55);
   v1.add(st);
   
   Student st2 = new Student(02 , "Swapnil" , 100);
   v1.add(st2);
   
   Student st3 = new Student(03 , "Pranev" , 89);
   v1.add(st3);
   
   for(Object o:v1){
     Student s=(Student)o;
     if(s.getMarks() > 60){
      System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
     }
    
   }
   }
}



/*
 for(Object o:v)
		 {
		    Employee e=(Employee)o;
			  System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		 }

*/
