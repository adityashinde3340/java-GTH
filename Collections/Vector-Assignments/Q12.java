/*
Q12.Create an Employee POJO class with:
id
name
salary
Store employees in Vector and display employees having salary greater than 25000.
Description
Logical operation:
if(salary > 25000)
Input
1 Raj 20000
2 Simran 30000
3 Ajay 27000
4 Ramesh 18000
Output
Employees with salary above 25000:

2 Simran 30000
3 Ajay 27000

*/

import  java.util.*;

class Employee{
   private int id;
   private String name;
   private int salary;
   
   public Employee(int id , String name , int salary){
      this.id = id;
      this.name = name;
      this.salary = salary;
   }
   
   public int getId(){
     return id;
   }
   public String getName(){
     return name;
   }
   public int getSalary(){
     return salary;
   }
}
public class Q12{
  public static void main(String x[]){
   Vector<Object> v1 = new Vector<>();
   Employee emp1 = new Employee(1 , "Raj" ,  20000);
   v1.add(emp1);
   Employee emp2 = new Employee(2 , "Simran" ,30000);
   v1.add(emp2);
   Employee emp3 = new Employee(3 , "Ajay" ,27000);
   v1.add(emp3);
   Employee emp4 = new Employee(4 , "Ramesh", 18000);
   v1.add(emp4);
   System.out.println("Employees with salary above 25000:");
   for(Object o:v1){
      Employee e=(Employee)o;
       if(e.getSalary() > 25000){
          System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
       }
   }
   
  }
}

