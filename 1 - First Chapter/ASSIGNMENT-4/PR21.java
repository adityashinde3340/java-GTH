//Q21. Write a Java program to reverse a number without using loop.
//Input a number: 123 Reverse number: 321
public class PR21 {
    public static void main(String args[]) {
        int num = 123;

        int a = num % 10;          // 3 → last digit
        int b = (num / 10) % 10;   // 2 → middle digit
        int c = num / 100;         // 1 → first digit

        int reverse = (a * 100) + (b * 10) + c;

        System.out.println("Reverse number: " + reverse);
    }
}
