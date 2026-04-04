/*
Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type

*/
import java.util.Scanner;

public class Q10{

    public static void Fibonacci(int limit){
        int a = 0, b = 1;

        for(int i = 1; i <= limit; i++){
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a limit :");
        int l = sc.nextInt();

        Fibonacci(l);
    }
}
