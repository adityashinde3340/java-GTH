/* Q4. Write a java program to input any alphabet and check whether 
it is vowel or consonant using 
conditional operator.  */ 

import java.util.Scanner;

public class PR04{
	public static void main(String c[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a char : ");
	char ch = sc.next().charAt(0);
	
	String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "vowel" : "consenet";
	System.out.println("res = "+ res);
	}
}