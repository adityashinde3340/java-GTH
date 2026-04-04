/*
Q1. Write a java program to calculate the sum of digit without using while loop. 
Input : 123 
Output : 6 

*/

import java.util.Scanner;

public class PR1{
	public static void main(String x[])
	{
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
    int sum = 0;
    
	int last = num % 10;
    num = num / 10;
	int sec_last = num % 10;
	num = num / 10;
	int th_last = num;
	sum = last+sec_last+th_last;
	System.out.println("Sum ="+sum);
	
	
	
    }

}




/*
import java.util.Scanner;

public class PR1{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.peintln("Enter a number : ");
		int num = sc.nextInt();
		
		if(num == 0){
			System.out.println(num+" is of 1 digits");
			if(num < 0){
				num = num * -1;
			}
		}
	}
}

*/