//Q32. Write a Java program to check whether a triangle is valid or not

import java.util.Scanner;

public class PR32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();
        System.out.print("Enter second angle: ");
        int b = sc.nextInt();
        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        // A triangle is valid if sum of angles is 180 and all angles are greater than 0
        String result = (a > 0 && b > 0 && c > 0 && (a + b + c == 180))? "Valid Triangle": "Not a Valid Triangle";

        System.out.println(result);
    }
}
