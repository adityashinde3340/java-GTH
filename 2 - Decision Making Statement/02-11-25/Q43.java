//Q43. Write a java program to accept two integers and check whether they are equal or not.
import java.util.*;

class Q43{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	if (num1 == num2) {
		System.out.println("both are equal : ");
	}
	else{
		System.out.println("not equal");
	}
	}
}