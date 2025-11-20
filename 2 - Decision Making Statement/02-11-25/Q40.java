//Q40. Write a java program to input any character and check whether
// it is alphabet, digit or special character.
//34 to 47 special char
//58 to 68 
//91 to 96
//48 to 57 number
import java.util.Scanner;
public class Q40{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a char : ");
	char ch = sc.next().charAt(0);
    if ((ch  >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
		System.out.println(ch + " is alphabetic");
	}	
	else if (ch >= 48 && ch <=57) {
		System.out.println(ch +" is number ");
	}
    else {
		System.out.println("is special Charecter");
	}
	}
}