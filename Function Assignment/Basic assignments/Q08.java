/*
Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function

*/
import java.util.Scanner;
public class Q08{
	Scanner sc = new Scanner(System.in);
	public void opr(){
		System.out.println("Enter base number : ");
		int baseNum = sc.nextInt();
		System.out.println("Enter exponent : ");
		int exponent = sc.nextInt();
		int result = 1;
		
		for(int i = 1 ; i <= exponent ; i++){
			result = baseNum * baseNum;
		}
		
		System.out.println("result = "+result);
	}
	
	public static void main(String x[]){
		Q08 obj = new Q08();
		obj.opr();
	}
}