//Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.Scanner;
public class Q50{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	
	int num = sc.nextInt();
	double sqr_num = Math.sqrt(num);
	if (sqr_num == (int) sqr_num) {
		System.out.println("perfect integer");
	}
	else{
		System.out.println("Not a perfect square");
	}
}
}