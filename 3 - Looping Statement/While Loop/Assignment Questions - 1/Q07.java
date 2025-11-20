/*WAP to input number and check number is duck or not  
	Input: 1024  - it is duck number  
	Input: 12345 - it is not duck number */
	
import java.util.Scanner;

public class Q07{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
    int num = sc.nextInt();
	int count = 0;
     while(num > 1){
     count = num % 10;
	 num = num / 10;
	    if(count == 0)
		{
			System.out.println("duck number");
			break;
		}
 		else{
			System.out.println("not a duck number");
			break;
		}
        		
	 }	
	}
}