//Q8. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
//Formula :- fah = (cel * 9 / 5) + 32;
public class PR3{
	public static void main(String x[]){
		System.out.println("");
		int tempInCl = 45;
        float tempInFr = (tempInCl * 9 / 5) + 32;
		System.out.println("In Celsius = "+tempInCl);
		System.out.println("In Fahrenheit = "+tempInFr);	
	}
}