//Q30. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
//Input: 15
//Output: Multiple of both 3 and 5

import java.util.*;
public class PR30{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number To Check : ");
    int num = sc.nextInt();
    String result = (num % 3 == 0) && (num % 5 == 0) ? num+" is multiple of 3 and 5" : num+" is not multiple of 3 and 5" ;
	System.out.println(result);
	}
}