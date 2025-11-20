//Q42. Write a java program to read the age of a candidate and 
//determine whether he is eligible to cast his/her own vote.7

import java.util.Scanner;
class Q42{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("You can Vote");
		}
		else{
			System.out.println("You can not vote");
		}
	}
}