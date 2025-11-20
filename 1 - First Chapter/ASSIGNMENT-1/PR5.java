//Q 5. Write a java program to enter radius of a circle and find its 
//diameter,area and circumference.
//Formula :-
//diameter=2 * radius;
//circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;

public class PR5{
	public static void main(String x[]){
		  int radius = 7;
		  float diameter = 2f * radius;
		  float circumference = 2f * 3.14f * radius;
		  float area = 3.14f * radius * radius;
		  
	      System.out.println("Diameter = "+diameter);
          System.out.println("Circumference = "+circumference);
          System.out.println("Area = "+area);		  
	}
}