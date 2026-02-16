/*
Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function
*/
import java.util.Scanner;

public class Q09 {
    Scanner sc = new Scanner(System.in);

    public void opr() {
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = num;
        int result = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            result += fact;
            temp = temp / 10;
        }

        if (result == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }

    public static void main(String x[]) {
        Q09 obj = new Q09();
        obj.opr();
    }
}
