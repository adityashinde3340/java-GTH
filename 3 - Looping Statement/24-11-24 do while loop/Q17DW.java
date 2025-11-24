//Q17. Write a java program to find all factors of a number.

import java.util.Scanner;

public class Q17DW{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int num = sc.nextInt();
	int i = 1;
	do{
		if(num % i == 0){
		   System.out.println("factors = "+i);
		   
		}	
		i++;
	}
	while(i<101);
    }	
}