//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.Scanner; 
public class Q14{
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
	//System.out.println(num+" reversed = "+reverse);
	
	if(num == reverse){
		System.out.println(num+" is palindrome");
	}
	else{
		System.out.println(num+" is not palindrome");
	}	
	}
}