import java.util.Scanner;

public class PFLS{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Selling Price : ");
		int sellingPrice = sc.nextInt();
		System.out.println("Enter Cost Price : ");
		int costPrice = sc.nextInt();
        String result = (sellingPrice > costPrice) ? "Profit = " + (sellingPrice - costPrice) : "Loss = " + (costPrice - sellingPrice);
		System.out.println(result);
	}
}