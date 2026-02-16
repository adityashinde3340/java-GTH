/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.

*/
import java.util.Scanner;
class Q02{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
     	System.out.println("Enter a two numbers : ");	
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter choice + , - , * , / ");
		char ch = sc.next().charAt(0);
		calculator obj = new calculator();
		int result = 0;
		switch(ch){
			case '+' :
			result = obj.add(num1 , num2);
			System.out.println("result = "+result);
			break;
			
			case '-' :
			result = obj.subtract(num1 , num2);
			System.out.println("result = "+result);
			break;
			
			case '*' :
			result = obj.multiply(num1 , num2);
			System.out.println("result = "+result);
			break;
			
			case  '/':
			result = obj.divide(num1 , num2);
			System.out.println("result = "+result);
			break;
		}
	}
}

class calculator{
	static int add(int a , int b){
		return a + b;
	}
	
	static int subtract(int a , int b){
		return a - b;
	}
	
	static int multiply(int a , int b){
		return a * b;
	}
	static int divide(int a , int b){
		return a / b;
	}
}