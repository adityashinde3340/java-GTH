//Q51. Problem: 
//Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
//Example Input:
//m = 25, n = 12

import java.util.Scanner;

public class Q51{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number : ");
	int x = sc.nextInt();
	System.out.println("Enter Second number : ");
	int x1 = sc.nextInt();
	int diff = x - x1 ;
	if (diff >= 10 || diff <= -10) {
		System.out.println("Diff is greater than 10");
	}
	else{
		System.out.println("Diff is less than 10");
	}
}
}