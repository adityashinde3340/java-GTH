/*
Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value
*/

import java.util.Scanner;
public class Q07{
	Scanner sc = new Scanner(System.in);
	public void opr(){
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("factors = ");
		for(int i = 1 ; i <= num ; i++){
			if(num % i == 0){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String x[]){
		Q07 obj = new Q07();
		obj.opr();
	}
}