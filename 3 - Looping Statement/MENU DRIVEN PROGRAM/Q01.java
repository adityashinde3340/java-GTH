/*
1. **Simple Calculator**
   Create a menu with options:

   1. Addition
   2. Subtraction
   3. Multiplication
   4. Division
   5. Exit
      Keep repeating until the user chooses Exit.
*/

import java.util.Scanner;

public class Q01{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int ch;
  	do{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
	    ch = sc.nextInt();
		
		switch(ch){
		    case 1:
                System.out.println("Enter two numbers : ");
                int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println("Addition = "+(num1+num2));
                break;
			case 2:
			    System.out.println("Enter two numbers : ");
                int num3 = sc.nextInt();
				int num4 = sc.nextInt();
				System.out.println("Substraction = "+(num3-num4));
				break;
			case 3:
			    System.out.println("Enter two numbers : ");
                int num5 = sc.nextInt();
				int num6 = sc.nextInt();
				System.out.println("Multiplication = "+(num5*num6));
				break;
			case 4:
                System.out.println("Enter two numbers : ");
                int num7 = sc.nextInt();
				int num8 = sc.nextInt();
				System.out.println("Division = "+(num7/num8));
				break;	
			case 5:
                System.out.println("Exiting ....");
                break;				
			default:
                System.out.println("Invalid Input");
                break;				
		}	
	}
	while(ch != 5);
	}		
}	
