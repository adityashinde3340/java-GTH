//Q45. Write a java program to find the minimum between two numbers. 
import java.util.Scanner;

public class Q45{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b){
			System.out.println(a+" is greater");
		}
		else{
			System.out.println(b+" is greater");
		}
	}
}