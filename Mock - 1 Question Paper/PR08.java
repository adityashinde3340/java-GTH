/*Q8. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount.*/

import java.util.Scanner;

public class PR08{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter sales amount : ");
	int sales = sc.nextInt();
	int comm = 0;
	if(sales <= 0 )
	{
		System.out.println("invalid input");
	}
	else
	{
		if (sales < 5000) {
		    comm = sales * 2 / 100;
	    }
	    else if (sales >= 5000 && sales <= 10000) {
		    comm = sales * 5 / 100;
	    }
	    else if(sales  > 10000){
		    comm = comm * 10 / 100;
	    }
	}
	System.out.println("commission = "+comm);
	
	 
	}
}