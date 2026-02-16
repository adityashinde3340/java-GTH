/*Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25
*/

import java.util.Scanner;
public class Q04{
	Scanner sc = new Scanner(System.in);
	public void greatest(){
		System.out.println("Enter two numbers -> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == num2){
			System.out.println("both are equal ");
		}
		else{
			if(num1 > num2){
				System.out.println(num1+" is greatest ");		
			}
			else{
				System.out.println(num2+" is greater");
			}
		}	
	}
	
	
	public static void main(String x[]){
		Q04 obj = new Q04();
		obj.greatest();
	}
}