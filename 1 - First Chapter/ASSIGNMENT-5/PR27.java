//Q27. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
//·        Example: a → A, Z → z.
import java.util.Scanner;
public class PR27{
	
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
    char i = sc.nextChar();
    System.out.println(i + " = " + (i + 32));	
	}
}
