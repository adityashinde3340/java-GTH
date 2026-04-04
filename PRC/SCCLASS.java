// WAP input  radius from keyboard and calculate its area.

import java.util.Scanner;

public class SCCLASS{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		float radius;
		System.out.println("Enter Radius in cm : ");
		radius = sc.nextFloat();
		float areaOfCircle = 3.14f * radius * radius;
        System.out.println("Area Of Circle = "+areaOfCircle+"cm");		
	}
}