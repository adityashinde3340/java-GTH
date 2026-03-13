/*
5) Bank and SavingsAccount
Create a class Bank with:
• Method getInterestRate()
Create a subclass SavingsAccount that:
• Adds method calculateInterest()
Task: Calculate interest for given balance.


*/
import java.util.Scanner;
class Bank{
	public int getInterestRate(int n){
		return n = n +(n * 5) / 100;
	}
}

class SavingsAccount extends Bank{
	int accountNo;
	int bal;
}

public class Q05{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		SavingsAccount obj = new SavingsAccount();
		System.out.println("Enter account number : ");
		obj.accountNo = sc.nextInt();
		System.out.println("Enter account balance : ");
		obj.bal = sc.nextInt();
		int afterIntrest = obj.getInterestRate(obj.bal);
		System.out.println("intrest = 5");
		System.out.println("final = "+afterIntrest);
	}
}