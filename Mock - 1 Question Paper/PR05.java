//Q5. // Write a java program to check whether year is leap year or not using conditional operator

import java.util.Scanner;

public class PR05{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year ");
	int num = sc.nextInt();
	if((num % 400 == 0 && num % 100 !=0) || num % 4 == 0){
		System.out.println(num+" is leap year");
		
	}
	else{
		System.out.println(num +" is not a leap year");
	}
	}
}