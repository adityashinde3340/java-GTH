//Q9. Write a java program to print a multiplication table of any number.


import java.util.Scanner;
public class Q09{
    public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to print table : ");
	int num = sc.nextInt();
	int i = 1;
	while(i <=10)
	{
		System.out.println(num+" x "+i+" = "+(num*i));
		i++;
	}
	}	
}	