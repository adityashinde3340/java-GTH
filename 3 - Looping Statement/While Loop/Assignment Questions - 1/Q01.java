//Q1. WAP to input number from keyboard and print its table? 

import java.util.Scanner;
public class Q01{
	public static void main(String x[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number : ");
	 int num = sc.nextInt();
	 int i = 1;
	 while(i <= 10){
		System.out.println(num+" x "+i+" = "+(num * i));
		i = i+1;
	}	
	}
}
