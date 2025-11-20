//Q34. Write a Java program to check whether a number is positive , negative or zero.
import java.util.Scanner;
public class Q34{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		if (x > 0){
			System.out.println("+ positive number");
		}
		else if (x < 0) {
			System.out.println("- negative Number");
		}
		else if (x == 0) {
			System.out.println("number is 0");
		}
	}
}