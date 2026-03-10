/*
15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.

*/

import java.util.Scanner;
public class Q15{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number : ");
        int num1 = sc.nextInt();
		System.out.println("enter second number : ");
		int num2 = sc.nextInt();
		
		Swapper obj = new Swapper();
		obj.swap(num1 , num2);
		System.out.println();
	}
	
}

class Swapper{
	static void swap(int n , int b){
		 n = n + b;
         b = n - b;
         n = n - b;
		 
        System.out.println("num1 = "+n);
		System.out.println("num2 = "+b);
		 
	}
}
