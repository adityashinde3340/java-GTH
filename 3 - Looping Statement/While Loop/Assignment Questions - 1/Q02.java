//Q2. WAP to input number and calculate its factorial?


import java.util.Scanner;

public class Q02{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
	//int factoral = 1;
	int i = 1;
	int factorial = 1;
    while(i <= num){
        factorial = factorial * i;
        i += 1;	
    	
	}
   	System.out.println("factorial = "+factorial);		
	}
}