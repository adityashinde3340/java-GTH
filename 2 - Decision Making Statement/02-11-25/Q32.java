//Write a Java program to check whether a triangle is valid or not.
import java.util.Scanner;
public class Q32{
	public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter 3 sides of Tringle : ");
	   int first = sc.nextInt();
	   int second = sc.nextInt();
	   int third = sc.nextInt();
	   if((first+second) > third & (second+third) > first & (third+first) > second)
       {
        System.out.println("Valid Tringle");
       }
else{
	System.out.println("Not valid ");
}
	
	}
}