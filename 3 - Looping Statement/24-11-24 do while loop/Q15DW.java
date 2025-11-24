//Q15. Write a java program to print all ASCII characters with their values.

import java.util.Scanner;

public class Q15DW{
	public static void main(String x[]){
	//Scanner sc = new Scanner(System.in);
	int num = 1;
    do{
		System.out.println(num+" = "+(char)num);
		num += 1;
	}
	while(num<=127);
 	
	}
}