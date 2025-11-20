//Q29. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
//Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
import java.util.Scanner;
public class PR29{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Divident : ");
	int divident = sc.nextInt();
	System.out.println("Enter Divisor : ");
	int diviser = sc.nextInt();
	System.out.println("Quetient = "+(divident/diviser));
	System.out.println("Reminder = "+(divident%diviser));
	}
}