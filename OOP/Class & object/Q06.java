/*
6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.

*/
import java.util.Scanner;
public class Q06{
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		MaxFinder obj = new MaxFinder();
		int result = obj.findMax(num1 , num2 , num3);
		System.out.println("max = "+result);
	}	
}

class MaxFinder{
	static int findMax(int a , int b , int c ){
		int max = (a > b) ? ((a > c) ? a : c):((b > c) ? b : c);
		return max;
	}
}