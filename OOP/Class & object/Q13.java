/*
13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/


import java.util.Scanner;
public class Q13{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base number : ");
	int num = sc.nextInt();
	System.out.println("Enter power : ");
	int power = sc.nextInt();
	PowerCalculator obj = new PowerCalculator();
	int result = obj.power(num , power);
	System.out.println("res = "+result);
	}
}

class PowerCalculator{
	static int power(int a , int b){
		int pow = 0;
	    for(int i = 0 ; i <= b ; i++){
			pow = pow * a;
		}
		return pow;
		}
}