/*Q6. Write a java program to check whether number is neon or not.  
Input : 9 
Output : Neon Number  
Explanation: square is 9*9 = 81 and  
sum of the digits of the square is 9.*/

import java.util.Scanner;

public class PR06{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int square = (num * num);
	int first_num = square % 10;
	square = square / 10;
	int second_num = square;
	System.out.println(second_num);
	if((first_num + second_num) == num){
		System.out.println(num + " is neon number");
	}
	else{
	    System.out.println(num + " is not neon number");
	}
	
	}
	
}