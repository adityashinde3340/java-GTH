 /*Q4. WAP to input number and count its digit. 
	Input: 12345 
	Output: Number of digit in number is 5. */
	
import java.util.Scanner;

public class Q04{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
    int num = sc.nextInt();
    int count = 0;
    if (num == 0)
	{
		System.out.println("Number of digit in number is 1");
		
	}	
	else if(num < 0)
	{
		num = num * -1;
		count = 0;
		while(num>0)
		{
		    num = num / 10;
            count++;
            				
	    }
		System.out.println("count = "+count);
	}
	else if(num > 0)
	{
		count = 0;
		while(num>0)
		{
		    num = num / 10;
            count++;
				
	    }
		System.out.println("count = "+count);
	}
    	
	}
}	
	