/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.

*/
import java.util.Scanner;
public class Q05{
	
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter principal amount : ");
    int principal = sc.nextInt();
	System.out.println("Enter rate of intrest % : ");
    int intrest = sc.nextInt();
	System.out.println("Enter time in years : ");
	int time = sc.nextInt();
	SimpleInterest obj = new SimpleInterest(); 
	obj.calculate(principal , intrest , time);
	
	}
}

class SimpleInterest{
   
   static void calculate(int a , int b , int c){
	   
	   int result = (a * b * c) / 100;
	   System.out.println("simple intrest = "+result);
	   
   } 

}