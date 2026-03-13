/*
2) Shape → Rectangle → Cuboid
Create three classes:
• Shape
o displayShape ()
• Rectangle (inherits Shape)
o length
o width
o area ()
• Cuboid (inherits Rectangle)
o height
o volume ()
o area ()
Task: Calculate area and volume.
Area of Rectangle = length*width
Volume of Cuboid= length*width*height
Total surface area of cuboid=2(length* width + width* height + length *height),

*/
import java.util.Scanner; 
class Shape{
	Scanner sc = new Scanner(System.in);
	String shape;
	public void displayShape(){
		System.out.println("enter a shape : ");
		shape = sc.nextLine();
		System.out.println();
		System.out.println("shape = "+shape);
	}
}
class Rectangle extends Shape{
	int length;
	int width;
	public void area(){
		displayShape();
		System.out.println("enter length : ");
		length = sc.nextInt();
		System.out.println("enter width : ");
		width = sc.nextInt();
		System.out.println();
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		int area = length * width;
		System.out.println("area = "+area);
	}
}
class Cuboid extends Rectangle{
	int height;
	public void volume(){
		area();
		System.out.println("enter height : ");
		height = sc.nextInt();
		int vol = length * width * height;
		System.out.println("volume = "+vol+"cm2");
		System.out.println();
	}
}

public class Q02{
	public static void main(String x[]){
		Cuboid obj = new Cuboid();
		obj.volume();
	}
}