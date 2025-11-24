//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.Scanner;
public class Q13DW{
    public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	int num_count = 0;
	int reverse = 0;
	do{ 
	   num_count = temp % 10;
	   temp = temp / 10;
	   reverse = reverse * 10 + num_count;
	}
	while(temp>0);
	String res = (num == reverse)? num+" is palindrome" : num+" is not palindrome";
	System.out.println(res);
	}		
}