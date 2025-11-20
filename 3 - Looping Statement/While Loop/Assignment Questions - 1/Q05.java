//Q5. WAP to input number and reverse it.

import java.util.Scanner;

public class Q05{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A number : ");
	int num = sc.nextInt();
	int temp = num; 
	int count = 0;
	int rev = 0;
	   while(num > 0)
	   {
	   int digit = num % 10;
	   rev = rev * 10 + digit;
	   num = num / 10;	   
	   }
	System.out.println(temp+" = "+rev);
	}
}