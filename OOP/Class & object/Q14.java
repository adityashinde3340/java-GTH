/*
14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime

*/
import java.util.Scanner;

class PrimeChecker{
	static void isPrime(int n){
		 boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
	}
}

public class Q14{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number : ");
	int num = sc.nextInt();
	PrimeChecker obj = new PrimeChecker();
	obj.isPrime(num);
	}
}