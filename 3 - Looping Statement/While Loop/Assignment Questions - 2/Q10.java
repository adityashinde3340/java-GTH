//Q10. Write a java program to count the number of digits in a number.

import java.util.Scanner;
public class Q10{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a number : ");
   int num = sc.nextInt();
   int temp = num , count = 0;
   if(temp == 0){
	   count = 1;
   }
   else{
	   while(temp != 0)
	   {
		   temp = temp / 10;
		   count+=1;
	   }
	  
   }
   System.out.println("count = "+count);
   }
}	