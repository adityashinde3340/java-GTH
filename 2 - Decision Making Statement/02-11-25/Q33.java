//Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
import java.util.Scanner;
public class Q33{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sides of Tringle : ");
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
	if ((f == s) && (s == t)) {
    System.out.println("Equilateral");
    }
    else if ((f == s) || (s == t) || (t == f)) {
    System.out.println("Isosceles");
    }
    else {
    System.out.println("Scalene");
    }

	}
}