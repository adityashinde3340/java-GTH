/*
Q9. Write a java menu-driven program in java using switch case. 
1. Check Number is positive , negative or zero. 
2. Check Number is even or odd. 
3. Find max number using 2 number
*/

import java.util.Scanner;
public class PR09{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter choice beetween 1 , 2 , 3 : ");
    int choice = sc.nextInt();
	switch(choice){
		case 1 : 
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String res = (num < 0) ? "negative" : "positive";
		System.out.println(res);
		break;
		
		case 2 :
		System.out.println("Enter a number : ");
		int num2 = sc.nextInt();
		String res1 = (num2 % 2 == 0) ?"even" : "odd";
		System.out.println(res1);
		break;
		
		case 3 : 
		System.out.println("Enter two numbers : ");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		String res2 = (num3 > num4) ? num3+" is greater" : num4+" is greater";
		System.out.println(res2);
		break;
		
		default:
		System.out.println("Invalid Input");
		break;
	}
	}
}