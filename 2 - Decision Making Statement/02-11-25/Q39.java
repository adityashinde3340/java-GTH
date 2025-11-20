//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;
public class Q39{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	char ch = sc.next().charAt(0);
	  if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ||
            (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is not a vowel");
        }
	}
}