//Q9. Write a java program to enter two angles of a triangle and find the third angle. 

//third_angle = 180 - (angle1 + angle2)
public class PR4{
	public static void main(String x[]){
	int firstAngle = 90;
    int secondAngle = 110;
    int thirdAngle = 180 - (firstAngle + secondAngle);	
	System.out.println("First Angle = "+firstAngle);
	System.out.println("Second Angle = "+secondAngle);
	System.out.println("Third Angle = "+thirdAngle);
	}
}