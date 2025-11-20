/*Q7. Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and 
Computer, calculate percentage and grade according to given 
conditions: percentage >= 90% : Excellent 
percentage >= 75% : Good 
percentage >= 50% : Average 
percentage < 50 : Poor */

import java.util.Scanner;

public class PR07{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks of five subjects: ");
	System.out.println("Physics : ");
	int phy = sc.nextInt();
	System.out.println("Chemistry : ");
	int chem = sc.nextInt();
	System.out.println("Biology : ");
	int bio = sc.nextInt();
	System.out.println("Mathematics : ");
	int math = sc.nextInt();
	System.out.println("Computer Science : ");
	int cs = sc.nextInt();
	
	
	int percentage = (phy+chem+bio+math+cs) / 5;
	if (percentage >= 90 && percentage <= 90) {
		System.out.println("Excellent");
	}
	else if (percentage >= 75 && percentage <90) {
		System.out.println("Good");
	}
	else if(percentage >= 50 && percentage < 75){
		System.out.println("Average");
	}
	else if(percentage < 50){
		System.out.println("poor");
	}
	
	System.out.println(percentage+"%");
	}
}
