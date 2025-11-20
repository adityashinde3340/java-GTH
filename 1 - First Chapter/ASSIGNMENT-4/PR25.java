//Q25. Write a java program to check whether number is palindrome or not.
import java.util.Scanner;
public class PR25{
	public static void main(String x[]){
	import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is not a Palindrome number");
        }

        sc.close();
    }
}

		
	}
}