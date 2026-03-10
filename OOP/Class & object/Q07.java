/*
7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.

*/
import java.util.Scanner;
public class Q07{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age : ");
	int age = sc.nextInt();
	voter obj = new voter();
	obj.isEligible(age);
	}
}

 class voter{
	static void isEligible(int a){
		if(a > 18){
			System.out.println("you are eligible to vote : ");
		}
		else{
			System.out.println("you are not elgible to vote : ");
		}
		
	}
}