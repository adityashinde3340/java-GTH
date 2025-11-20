/*
Q4. Month Name and Days
Write a program that takes a number (1–12) as input and prints the corresponding month name and the number of days in that month. Use a 'switch' statement.

*/
import java.util.Scanner;
public class Q04{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number : ");
	int num = sc.nextInt();
    switch(num){
		case 1:
		System.out.println("January - 31");
		break;
		
		case 2:
		System.out.println("February - 28");
		break;
		
		case 3:
		System.out.println("March - 31");
		break;
		
		case 4:
		System.out.println("April - 30");
		break;
		
		case 5:
		System.out.println("May - 31");
		break;
		
		case 6:
		System.out.println("June - 30");
        break;
		
		case 7:
		System.out.println("july - 31");
		break;
		
		case 8:
		System.out.println("Augast - 31");
		break;
		
		case 9:
		System.out.println("September - 30");
		break;
		
		case 10:
		System.out.println("October - 31");
		break;
		
		case 11:
		System.out.println("November - 30");
		break;
		
		case 12:
		System.out.println("December");
		break;
	}	
	}
}

