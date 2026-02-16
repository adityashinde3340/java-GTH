/*
Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5

*/

import java.util.Scanner;
public class Q03{
	Scanner sc = new Scanner(System.in);
	public void toN(){
		System.out.println("Enter a number -> ");
		int num = sc.nextInt();
		for(int i = 0 ; i <= num ; i++){
			System.out.print(i+" ");
		}
	}
	
	
	public static void main(String x[]){
		Q03 obj = new Q03();
		obj.toN();
	}
	
}