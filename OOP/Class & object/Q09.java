/*
9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.

*/
import java.util.Scanner;
public class Q09{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a temprature in C : ");
		int temprature = sc.nextInt();
		TemperatureConverter obj = new TemperatureConverter();
		int result = obj.convertToFahrenheit(temprature);
		System.out.println("in farheinhight = "+result);
	}
}

class TemperatureConverter{
	static int convertToFahrenheit(int a){
		int inFahrenheit = a * (9 / 5) + 32;
		return inFahrenheit;
	}
}