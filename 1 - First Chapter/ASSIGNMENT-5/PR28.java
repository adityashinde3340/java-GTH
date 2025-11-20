//Q28. Write a Java program to calculate the net salary of an employee.
//Input: basic salary, HRA %15, DA7%, and tax9%.
import java.util.Scanner;
public class PR28{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Salary : ");	
	int sal = sc.nextInt();
	float HRA = sal * 15 / 100;
    float DA = sal  * 5 / 100;
    float tax = sal * 9 / 100;
    System.out.println("Basic Salary = "+sal);
    System.out.println("HRA = "+HRA);
    System.out.println("DA = "+DA);
    System.out.println("tax = "+tax); 
    System.out.println("");	
	}
}