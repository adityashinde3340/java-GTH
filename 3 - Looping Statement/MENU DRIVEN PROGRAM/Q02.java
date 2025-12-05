/*
2. **Even / Odd Checker**
   Menu:

   1. Check Even or Odd
   2. Exit
*/

import java.util.Scanner;

public class Q02{
	public static void main(String x[])
	{ 
        Scanner sc = new Scanner(System.in);
		int num;
		
		do{
		  System.out.println("1 : Check Even or Odd");
          System.out.println("2 : Exit");
          num = sc.nextInt();
          switch(num){
			case 1:
			    System.out.println("Enter a number : ");
				int check_num = sc.nextInt();
			    if(check_num % 2 == 0)
					System.out.println("Even Number : ");
				else
					System.out.println("Odd Number : ");
				break;
		    case 2:
                System.out.println("Exiting .....");	
                break;
			default:
			    System.out.println("Invalid Input : ");
				break;
		  }		  
		}
		while(num != 2);	
	}
}

