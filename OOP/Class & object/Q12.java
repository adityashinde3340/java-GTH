/*
12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.

*/

import java.util.Scanner;
public class Q12{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	FactorialCalculator obj = new FactorialCalculator();
	obj.findFactorial(num);
	}
}

class FactorialCalculator{
	static void findFactorial(int a){
		long fact = 1;
		for(int i = 1 ; i <= a ; i++){
			fact = fact * i;
		}
		System.out.println("factorial = "+fact);
	}
}