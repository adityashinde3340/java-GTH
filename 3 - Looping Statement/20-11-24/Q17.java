//Q17. Write a java program to find all factors of a number.

import java.util.Scanner;

public class Q17{
	public static void main(String x[]){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a num : ");
    int num = sc.nextInt();
	for(int i = 1; i<=100 ;i++)
	  { 
        if(num % i == 0)
		{
			System.out.println(i+" is factor of "+num);
		}
	  }	
	}
}