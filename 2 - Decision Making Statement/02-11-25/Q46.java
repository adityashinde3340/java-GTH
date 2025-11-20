//Q46. Write a java program to find a minimum between three numbers. 

import java.util.Scanner;
public class Q46{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three number ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if (num1 > num2 && num1 > num3) {
		System.out.println(num1+"is greater");
	}
	else if(num2 > num1 && num2 > num3){
		System.out.println(num2+" is greter");
	}
	else {
		System.out.println(num3+" is greater");
	}
	}
}