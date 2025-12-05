//Q11. Write a java program to calculate the sum of digits in a number.


import java.util.Scanner;
public class Q11{
   public static void main(String x[]){
	
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int num_count = 0;
	int temp = num;
	int sum = 0;
	
	do{
	   num_count = temp % 10;
	   temp = temp / 10;
	   sum = sum + num_count;
	   
	}
	while(temp!=0);
	System.out.println("sum of digits = "+sum);
   }	  
}	