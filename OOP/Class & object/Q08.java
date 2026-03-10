/*
8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/
import java.util.Scanner;
public class Q08{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		SquareFinder obj = new SquareFinder();
		int sq = obj.square(num);
		System.out.println("square = "+sq);
	}
}

class SquareFinder{
	
	static int square(int a){
		int result = a * a;
		return  result;
	}
	
}