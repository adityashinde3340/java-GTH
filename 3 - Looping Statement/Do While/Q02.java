/*Q2. Count the number of digits in a given number using a do-while loop.
	→ Input: 12345 → Output: 5*/


import java.util.Scanner;
public class Q02{
	public static void main(String x[])
	{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	if (temp < 0){
    temp = temp * -1;	
	}	
	int count = 0 , last = 0;
	
	do{
		   temp = temp / 10;
		   count += 1;	
	}
	while(temp > 0);
	if(temp == 0)
		System.out.println("count = 0");
	else
		System.out.println("count = "+count);
	}	
	
}
