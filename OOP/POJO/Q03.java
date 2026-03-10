/*
Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.

*/

class Car{
	private int carId;
	private String model;
	private int fuelConsumed;
	private int distanceTravelled;
	
	
	public Car(int carId , String model , int fuelConsumed , int distanceTravelled){
		this.carId = carId;
		this.model = model;
		this.fuelConsumed = fuelConsumed;
		this.distanceTravelled = distanceTravelled;
	}
	
    public int getCarId(){
		return carId;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getFuelConsumed(){
		return fuelConsumed;
	}
	
	public int getDistanceTravelled(){
		return distanceTravelled;
	}
	
	public int getMileage(){
		return getDistanceTravelled() / getFuelConsumed();
	}
	
}

public class Q03{
	public static void main(String x[]){
		Car[] cr = new Car[3];
		
		cr[0] = new Car(01 , "Thar" , 45 , 400);
		cr[1] = new Car(02 , "isuzu" , 50 , 500);
		cr[2] = new Car(03 , "wrangler" , 40 , 600);
			
		for(int i = 0 ; i < cr.length ; i++){
			System.out.println("milage of "+cr[i].getModel()+" is "+cr[i].getMileage());
		}	
		
		
		int total = 0;
		for(int i = 0 ; i < cr.length ; i++){
			total = cr[i].getMileage();
		}
		
		int avaregeMilage = total / cr.length;
		System.out.println();
		System.out.println("the average milage = "+avaregeMilage);
		System.out.println();
		System.out.println("the cars above milage : ");
		
		for(int i = 0 ; i < cr.length ; i++){
			if(cr[i].getMileage() > avaregeMilage){
				System.out.println(cr[i].getModel());
			}
		}
		
		System.out.println();
		
		String bestCar = " ";
		int bestMilage = cr[0].getMileage();
		for(int i = 0 ; i < cr.length ; i++){
		    if(cr[i].getMileage() > bestMilage){
				bestMilage  = cr[i].getMileage();
				bestCar = cr[i].getModel();
			}
		}
		
		System.out.println("the car is "+bestCar+" with best milage : "+bestMilage);
		
			
		}
	}
