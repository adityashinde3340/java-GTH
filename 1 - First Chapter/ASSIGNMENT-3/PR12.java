//Q12. Write a java program to calculate the simple intrest

public class PR12{
	public static void main(String x[]){
		int totalAmount = 10000;
		int intrestRate = 17;
		int timeInYears = 4;
		
		float totalInterest = (totalAmount*intrestRate*timeInYears) / 100;
		System.out.println("Total Intrest = "+totalInterest);
	}
}