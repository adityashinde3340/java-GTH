//Q5. Check whether a number is an Armstrong number using a do-while loop.
//	→ Input: 153 → Output: Armstrong number

import java.util.Scanner;

public class Q05{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	int temp2 = num;
	int power = 0;
	int count = 0;
	int sum = 0;
	do{
       //count = temp % 10;
	   temp = temp / 10;
	   power = power + 1;
    }
    while(temp > 0);	
	System.out.println("power = "+power);
	
	do{
		int p = 1;
		count = temp2 % 10;
		temp2 = temp2 / 10;
		for(int i = 0;i < power;i++){
			p = p * count;
	        //sum = p + sum;
		}
		sum = sum + p;
	}
	while(temp2 > 0);
	
	String res = (sum == num) ? num+" is armstrong number" : num+" is not armstrong number";
	
	System.out.println(res);
	}
}