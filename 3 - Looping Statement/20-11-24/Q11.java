//Q11. Write a java program to calculate the sum of digits in a number

import java.util.Scanner;

public class Q11{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int temp = num;
	int count = 0;
	int sum = 0;
	
    for(int i = 0; i <= num;i++)
	{
		count  = temp % 10;
		temp = temp / 10;
		sum = sum + count;
	}
	
	System.out.println("sum of digits = "+sum);
	}
}