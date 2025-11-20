 // Q31. Write a Java program to check whether a number is even or odd. 
import java.util.Scanner;
public class PR31{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
    int num = sc.nextInt();
	String result = (num % 2 == 0) ? num+" is even number" : num+" is odd number";
	System.out.println(result);
	}
}