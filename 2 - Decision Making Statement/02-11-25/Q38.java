//Q38. Write a Java program to check whether a year is leap year or not.
import java.util.Scanner;
//4 and 400 divide
//not 100
public class Q38{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter year : ");
	int year = sc.nextInt();
	if ((year%4==0 && year%100!=0) || (year%400==0)){
	System.out.println(year + " is leap year");
	}
	else{
		System.out.println(year +" is not leap year");
	}
	}
}