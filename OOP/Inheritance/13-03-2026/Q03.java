/*
3) Vehicle → Car → ElectricCar
Create three classes:
• Vehicle
o brand
o start()

• Car (inherits Vehicle)
o model
o displayCar()

• ElectricCar (inherits Car)
o batteryCapacity
o displayElectricCar()
Task: Display full details of electric car.

*/
import java.util.Scanner;
class Vehicle{
	Scanner sc = new Scanner(System.in);
	String brand;
	public void start(){
		System.out.println("Enter brand : ");
		brand = sc.nextLine();
	}	
}

class car extends Vehicle{
	
	String model;
	public void displayCar(){
		start();
		System.out.println("Enter model : ");
		model = sc.nextLine();
	}
	
}

class ElectricCar extends car{
	
	int batteryCapacity;
	    public void displayElectricCar(){
		displayCar();
		System.out.println("enter battery capacity : ");
		batteryCapacity = sc.nextInt();
	}
}
 
public class Q03{
	public static void main(String x[]){
		ElectricCar obj = new ElectricCar();
		obj.displayElectricCar();
	        System.out.println();
			System.out.println("brand = "+obj.brand);
			System.out.println("model = "+obj.model);
			System.out.println("batteryCapacity = "+obj.batteryCapacity);
			
		
	}
}