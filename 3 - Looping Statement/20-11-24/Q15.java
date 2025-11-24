//Q15. Write a java program to print all ASCII characters with their values.

import java.util.Scanner;
public class Q15{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ASCII VALUES WITH THEIR VALUES");
	
    for(int i = 0; i <= 127; i++){
	  System.out.println(i+" = "+(char)i);

	}	
	}	
}
