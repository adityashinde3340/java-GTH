//Q23. Write a program to calculate sum of first and 
//last digit of a number without using loop.

public class PR23{
	public static void main(String x[])
	{
	int num = 548;
	int i1 = num / 100;
	int i2 = (num / 10) % 10;
	int i3 = num % 10;
	System.out.println("Sum = "+(i1+i3));
	}
}
