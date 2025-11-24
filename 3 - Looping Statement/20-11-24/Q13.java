 // Q13. Write a java program to enter a number and print its reverse.
 
import java.util.Scanner; 
public class Q13{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num : ");
    int num = sc.nextInt();
	int temp = num;
    int count = 0 ;
    int reverse = 0;
    
    for(int i = 0 ; i <= temp ; i++){
		count = temp % 10;
		temp = temp / 10;
		reverse = reverse * 10 + count;
	}	
	System.out.println(num+" reversed = "+reverse);
	}
}