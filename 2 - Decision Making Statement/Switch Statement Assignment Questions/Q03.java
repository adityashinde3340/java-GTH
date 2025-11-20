/*
 Q3. Vowel or Consonant
Write a program that reads a character from the user and determines whether it is a vowel or consonant using 'switch'.
(Hint: Handle both uppercase and lowercase vowels.)


*/


import java.util.Scanner;

public class Q03{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a char : ");
    char ch = sc.next().charAt(0);
    switch (ch){
		case 'a','e','i','o','u':
		System.out.println(ch+"is lowercase vowel");
		break;
		
		case 'A','E','I','O','U':
		System.out.println(ch+" is uppercase vowel");
		break;
		
		default:
		System.out.println(ch+" is not a vowel ");
		break;
	} 	
	}
}