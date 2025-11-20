//Q31. Write a Java program to check whether a number is even or odd. 

import java.util.Scanner;
public class Q31{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int x = sc.nextInt();
	if(x%2==0){
		System.out.println(x+" is even number");
	}
	else{
		System.out.println(x+" is odd number");
	}
	
}
}