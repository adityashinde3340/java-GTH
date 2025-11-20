/*Q3. Find the sum of digits of a number using a do-while loop.
	→ Input: 9876 → Output: 30*/


import java.util.Scanner;
public class Q03{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	int count = 0;
	int temp2 = 0;
	if (temp < 0){
	   temp2 = temp * -1;
	}
	temp = temp2;
    do{
		temp = temp / 10;
		count++;
	}
	while(temp > 0);
	
	System.out.println("count = "+count);
	}
}