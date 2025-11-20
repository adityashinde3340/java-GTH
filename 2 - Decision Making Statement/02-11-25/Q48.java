//Q48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.Scanner;

public class Q48{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a your name : ");	
	String name =  sc.nextLine();
	System.out.println("Enter Marks : ");
	int marks = sc.nextInt();
	if (marks >= 40) {
		System.out.println(name+" your marks are "+marks+" and your are pass ");
	}
	else{
		System.out.println(name+" your marks are "+marks+" and your are fail ");
	}
	}
}