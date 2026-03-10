/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/
import java.util.Scanner;
public class Q10{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		int radius = sc.nextInt();
		CircleArea obj = new CircleArea();
		int result = obj.findArea(radius);
		System.out.println("area of cicle = "+result);
	}
}

class CircleArea{
	static int findArea(int a){
		int b = (int)3.14f * (a * a);
		return b;
	}
}