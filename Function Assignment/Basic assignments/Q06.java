/*
Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function

*/

import java.util.Scanner;
public class Q06{
	Scanner sc = new Scanner(System.in);
	public void opr(){
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0, product = 1 ,count = 0;
		while(temp > 0){
			count = temp % 10;
			temp = temp / 10;
			sum = sum + count;
			product = count * product;
		}
		if(sum + product == num){
			System.out.println("Special number");
		}
		else{
			System.out.println("! Special number");
		}
	}
	
	public static void main(String x[]){
		Q06 obj = new Q06();
		obj.opr();
	}
}