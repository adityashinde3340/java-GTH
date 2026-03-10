/*
11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.

*/

import java.util.Scanner;
public class Q11{
	
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
	int num = sc.nextInt();
    NumberReverser obj = new NumberReverser();
	int result = obj.reverse(num);
	System.out.println("reverse = "+result);
	}
	
}

class NumberReverser{
	static int reverse(int a){
		int temp = a;
		int rev = 0;
		int count = 0;
		
		
		while(temp > 0){
			count = temp % 10;
			rev = rev * 10 + count;
			temp = temp / 10;
			count = 0;
		}
		
		return rev;
		
	}
}