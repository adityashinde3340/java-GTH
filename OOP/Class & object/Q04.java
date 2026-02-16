/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.

*/
import java.util.Scanner;
class Q04{
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		NumberChecker obj = new NumberChecker();
		obj.isEven(num);
	}
}

class NumberChecker{
	static void isEven(int a){
		if(a % 2 == 0){
			System.out.println(a+" is even");
		}
		else{
			System.out.println(a+" is not even");
		}
	}
}