/*
2) Vehicle and Car
Create a class Vehicle with:
        • brand
                    • speed
            Create a subclass Car that:
                    • Adds model
                    • Displays full vehicle details.
           Task: Call parent class method using inheritance.

*/

class Vehicle{
	String brand;
	int topSpeed;
}

class Car extends Vehicle{
	String model;
	int year;
}

public class Q02{
	
	public static void main(String x[]){
		   Car obj = new Car();
	       obj.brand = "Tata";
	       obj.topSpeed = 160;
	       obj.model = "Nexon";
	       obj.year = 2026;
		   
		   System.out.println("Brand = "+obj.brand);
		   System.out.println("Top Speed = "+obj.topSpeed);
		   System.out.println("Model = "+obj.model);
		   System.out.println("Year = "+obj.year);
	}	
}