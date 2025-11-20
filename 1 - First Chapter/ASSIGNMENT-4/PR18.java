//Q18. Write a Java program to convert days to years, month and week.


public class PR18{
	public static void main(String x[]){
		int days = 400;
		int months = days / 30;
		int years = days / 365;
	    System.out.printf("Months = %d\n",months);
		System.out.printf("years = %d\n",years);
	}
}