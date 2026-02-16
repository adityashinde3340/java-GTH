/*
Q2. Write a method that takes an integer and returns 1 if the number is even, otherwise returns 0.
Explanation
If number is divisible by 2 → Even
Else → Odd
Method returns an integer value
Method Signature - static int isEven(int num)
Input - num = 7 
Output - Odd
*/

public class Q02{
	public int opr(int num){
		if(num % 2 == 0){
			return 1;
		}
		else{
			return 2;
		}
	
	}
	
	public static void main(String x[]){
		Q02 obj = new Q02();
		int number = 45; 
		int result = obj.opr(number);
		String check = (result == 1) ? number+" is even" : number+" is odd";
		System.out.print(check);
	}
}