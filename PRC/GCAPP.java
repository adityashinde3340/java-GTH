// WAP to input qty and rate from keyboard and calculate its bill with 18% GST?
import java.util.Scanner;

public class GCAPP{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);	
    System.out.println("Enter Amount : ");
    int amount , qty;
	amount = sc.nextInt();
	System.out.println("Enter Quantity : ");
    qty = sc.nextInt();
	
	int totalAmount =  amount * qty;
	System.out.println("Total Amount Without GST = "+totalAmount);
	totalAmount += (totalAmount * 18) / 100;
	System.out.println("Total Amount With GST = "+totalAmount);
	}
}