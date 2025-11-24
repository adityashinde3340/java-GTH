//Q16. Write a java program to find power of a number.

import java.util.Scanner;
public class Q16{
   public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    System.out.println("Enter power : ");
    int power = sc.nextInt();
    int res = 1;
    for(int i = 1; i <= power; i++){
      res = res * num; 	
	}	
	System.out.println("result ="+res);
   }
}	