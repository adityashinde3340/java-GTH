//Q12. Write a java program to calculate the product of digits in a number.

import java.util.Scanner;
public class Q12{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	int count = 0;
	int product = 1;
	for(int i = 0 ; i <= temp ; i++) {
		count = num % 10;
		temp = temp / 10;
	    product = product * count;
		
	}
	System.out.println("product = "+product);
	}
}
