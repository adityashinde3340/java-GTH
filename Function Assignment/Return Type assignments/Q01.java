/*
Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30

*/
import java.util.Scanner;
public class Q01{
	
	public int getSum(int a , int b){
		return a + b;
	}


    public static void main(String x[]){
		Q01 obj = new Q01();
		int num1 = 10;
		int num2 = 20;
		int sum = obj.getSum(num1 , num2);
		System.out.println("sum = "+sum);
		
	}	
	
}