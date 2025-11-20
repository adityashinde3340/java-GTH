//Q20. Write a Java program and compute the sum of an integer's digits.
//Input : 123
//Output : 6

import java.util.Scanner;
public class PR20{
    public static void main(String x[]) {
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter Number To Sum : ");
    int num = sc.nextInt();
    int hun = num / 100;
    int tens = (num / 10) % 10;
    int ones = num % 10;
    
    int sum = hun + tens + ones;
    System.out.printf("sum = %d\n",sum);
    sc.close();
    }
}