/*
Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
*/

import java.util.*;
public class Q02{
	Scanner sc = new Scanner(System.in);
	public void sum(){
		
        System.out.println("Enter one numbers");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
			System.out.println("Even");
		}		
		else{
			System.out.println("odd");
		}
	}
	
	public static void main(String x[]){
	
	Q02 obj = new Q02();
	obj.sum();
		
	}
}
