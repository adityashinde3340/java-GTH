/* Q2. Write a Java program to convert seconds to hours, minutes and seconds. */

import java.util.Scanner;

public class PR02{
	public static void main(String x[]){ 	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter seconds : ");
	int seconds = sc.nextInt();
	int hours = seconds / 3600;
	int remining_sec = seconds % 3600;
	
	int minutes = remining_sec / 60;
	int fi_rem_sec = remining_sec % 60;
	
	System.out.println("hours = "+hours);
	System.out.println("minutes = "+minutes);
	System.out.println("seconds = "+fi_rem_sec);
	}	
}