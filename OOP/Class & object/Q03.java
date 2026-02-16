/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.

*/
import java.util.Scanner;
class Q03{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entar two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		NumberComparison obj = new NumberComparison();
		obj.compare(num1 , num2);
	}
	
}

class NumberComparison{
	
		static void compare(int a , int b){
			if(a == b){
				System.out.println("a == b");
			}
			else{
				if(a > b ){
				System.out.println("a is greater than b");
				}
			else{
				System.out.println("b is greater than a");
				}
			}
		}
	
}