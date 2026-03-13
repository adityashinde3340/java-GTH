/*

3) Shape and Rectangle
Create a class Shape with:
• Method displayShape()
Create a subclass Rectangle that:
• Takes length and width
• Calculates area
Task: Print shape name and area.

*/

class Shape{
	String shape;
	public void  displayShape(){
		System.out.println(shape);
	}
}

class Rectangle extends Shape{
	int lenght;
	int width;
	public void getArea(){
		System.out.println("area = "+(lenght*width));
	}
}	

public class Q03{
	public static void main(String x[]){
		Rectangle obj = new Rectangle();
		obj.shape = "Rectangle";
		obj.lenght = 10;
		obj.width = 30;
		obj.displayShape();
		obj.getArea();
	}
}
	

