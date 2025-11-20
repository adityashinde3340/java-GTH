//Q1. Write a java program to print all natural numbers
// from 1 to n. using while loop

import java.util.Scanner;
public class Q01{
  public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the maximum natural numbers : ");
    int i = sc.nextInt(); 	
	int j = 1;
	while(j <= i){
	    System.out.println(i);
		i+=1;
	}	
  }	
}	