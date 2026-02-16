/*
Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
*/
import java.util.Scanner;
public class Q01{
	Scanner sc = new Scanner(System.in);
	public void sum(){
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum = "+(num1 + num2));		
	}
	
	public static void main(String x[]){
	
	Q01 obj = new Q01();
	obj.sum();
		
	}
}