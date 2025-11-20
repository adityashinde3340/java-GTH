//Q1. Reverse a given number using a do-while loop.
//	→ Input: 1234 → Output: 4321

import java.util.Scanner;
class Q01{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	int count = 0;
	int revrsed = 0;
	if(num == 0)
	{
		System.out.println(num+" revrsed = 0");
	}
	else{
		do{	
			count = temp % 10;
			temp = temp / 10;
			revrsed = revrsed * 10 + count;
		}
		while(temp > 0);
        	
	}	
	    System.out.println(num+" revrsed = "+revrsed);
	
	
	}
}