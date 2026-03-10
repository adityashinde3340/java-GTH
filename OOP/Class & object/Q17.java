/*
17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.

*/
import java.util.Scanner;
class DigitSumCalculator{
	public int calculateSum(int n){
		int countSum = 0;
	    while(n > 0){
			int count = n % 10;
			n = n / 10;
			countSum = countSum + count;
		}
		return countSum;
	}
}


public class Q17{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		DigitSumCalculator  obj = new DigitSumCalculator();
		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();
		int result = obj.calculateSum(num1);
		System.out.println("Sum of digits : "+result);
	}
}