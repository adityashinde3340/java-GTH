//Q36. Write a Java program to check whether character is alphabetic or not.
//A to Z = 65 to 90
//a to z = 97 to 122
import java.util.Scanner;
public class Q36{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if ((ch  >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
		System.out.println(ch + " is alphabetic");
	}	
	else{
		System.out.println(ch+" is not alphabetic");
	}
	}
}