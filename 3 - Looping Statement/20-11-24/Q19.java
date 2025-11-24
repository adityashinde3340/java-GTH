//Q19. Write a java program to find the sum of the 
//first and last digit of a number.

import java.util.Scanner;
public class Q19{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
	int temp = num;
    int count = 0;
	int first = 0;
	int last = 0;
	last = temp % 10;
    for(int i = 0; i <= num ; i++){
		
		count = temp % 10;
		temp = temp / 10;
		if(count < 10 && count > 0)
		{
		first = count;
		}
	    
	}	
	System.out.println("sum = "+(first+last));

	}
}