//Q19. Write a Java program that reads a number and display the cube
import java.util.Scanner;

public class PR19{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	int cube = num*num*num;
	System.out.println("Cube = "+cube);
	}
}