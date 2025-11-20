//Q22. Write a program to find first and last digit of a number without 
//using loop in three digit.


public class PR22{
	public static void main(String x[]){
    int num = 548;
	int i1 = num / 100;
	int i2 = (num / 10) % 10;
	int i3 = num % 10;
	System.out.println("First Digit = "+i1);
	System.out.println("Last Digit = "+i3);
	}
}