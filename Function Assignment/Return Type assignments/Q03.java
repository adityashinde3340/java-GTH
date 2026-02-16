/*
Q3. Write a Java method that accepts a number and returns its square.
Explanation
Square means number × number
The method calculates and returns the result
Method Signature - static int square(int n)
Input - n = 5
Output - Square = 25

*/
import java.util.Scanner;
public class Q03{
	Scanner sc = new Scanner(System.in);
	public int opr(int n){
		return n * n;
	}
	
	public static void main(String x[]){
		Q03 obj = new Q03();
		//System.out.println("Enter a number");
		int num = 45;
		int result = obj.opr(num);
		System.out.println("result = "+result);
	}
}