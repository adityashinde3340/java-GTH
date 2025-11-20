//Q37. Write a Java program to input cost price and selling 
//price of a product and check profit or loss.

import java.util.Scanner;
public class Q37{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Cost Price : ");
	int costPrice = sc.nextInt();
	System.out.println("Enter Selling Price : ");
	int sellingPrice = sc.nextInt();
	if (sellingPrice > costPrice) {
		System.out.println("Invalid");
	}
	System.out.println("Profit = "+(sellingPrice - costPrice));
	}
}