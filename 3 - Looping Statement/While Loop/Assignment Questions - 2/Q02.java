//Q2. Write a java program to print all natural numbers in 
//reverse (from n to 1). using a while loop.
import java.util.Scanner;

public class Q02{
    public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num : ");
    int j = sc.nextInt();
    while(j > 0){ 
	   System.out.println(j);
	   j--;
	}	
    }	
}	