/* Q3. WAP input base and index value from keyboard and calculate power of 
       number. */ 
	   
import java.util.Scanner;

public class Q03{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int base = sc.nextInt();
	System.out.println("Enter power : ");
	int index = sc.nextInt();
	
	int i = 1;
	int powerd = 1;
    while(i <= index){
	powerd = base * base;
	i+=1;
	}	
	
	System.out.println("power = "+powerd);
    }	
}	   
	   
	   