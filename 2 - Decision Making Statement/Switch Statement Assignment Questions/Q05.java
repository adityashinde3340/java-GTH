/*
Write a program that takes electricity units as input and calculates the bill using 'switch' on ranges:
 1–100 units → ₹5/unit
 101–200 units → ₹7/unit
 201–300 units → ₹10/unit
 Above 300 units → ₹15/unit

*/

import java.util.Scanner;

class Q05{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of units : ");
		int units = sc.nextInt();
		double bill = 0;
		switch(units / 100){
			case 0:
            bill = units * 5;
			System.out.println("biil = "+bill);
			break;
			
			case 1:
			bill = (100 * 5) + ((units - 100) * 7) ;
			System.out.println("bill = "+bill);
            break;	

            case 3: 
            bill = (100 * 5) + ((units - 100) * 7) + ((units - 200)	* 10);
			System.out.println("bll = "+bill);
            break;
   
            case 4:
            bill = (100 * 5) + ((units - 100) * 7) + ((units - 200)	* 10) + ((units - 300) * 15); 
            System.out.println("bill = "+bill);
            break;			
		}
		
	}
}