//Q18. Write a java program to find the first and last digit of a number.

import java.util.Scanner;
public class Q18DW{
 	public static void main(String x[]){ 
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
    int last = num % 10;
    int first = 0;
	int count = 0;
	int i = 1;
	do{
    	count = temp % 10;
		temp = temp / 10;
        if(count<10 && count>0){
		first = count;
		}	
        i++;		
	}
	while(i<num);
	System.out.println("first = "+first);
	System.out.println("last = "+last);
 	}
}