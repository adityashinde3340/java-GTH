//Q7. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
//Formula :- cel = (fah - 32) * 5 / 9;

public class PR2{
	public static void main(String x[]){
        int tempInFr = 200;
		float tempInCl = (tempInFr - 32f) * 5f / 9f;
		System.out.println("Fahrenheit = "+tempInFr);
		System.out.println("Tempreture in Celsius = "+tempInCl);
	}
}