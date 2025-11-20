//Q8. Write a java program to find the sum 
//of all odd numbers between 1 to n.
import java.util.Scanner;
public class Q08{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.println("enter the maximum number : ");
	int i = sc.nextInt();
	int j = 1;
	
    while(j <= i){
		sum += j;
		j+=2;
	}	
	System.out.println("sum = "+sum);
    
   }	
}	