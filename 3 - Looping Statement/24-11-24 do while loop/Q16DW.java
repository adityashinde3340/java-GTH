//Q16. Write a java program to find power of a number.


import java.util.Scanner;
public class Q16DW{
   public static void main(String x[]){ 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Base Value : ");
   int base = sc.nextInt();
   System.out.println("Enter power : ");
   int power = sc.nextInt();
   int res = 1;
   int i = 0;
   do{
	res = res * base;
	i+=1;
   }
   while(i<power);  
   	
   System.out.println(res);
}	
}