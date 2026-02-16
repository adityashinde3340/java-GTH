/*Q5. Write a function that accepts a number and prints its multiplication table up to 10.
Explanation
Use a loop from 1 to 10
Multiply number with loop variable
Print result inside function
Example
Input: 3
Output:
3 x 1 = 3  
3 x 2 = 6  
3 x 3 = 9  
...
3 x 10 = 30
*/
import java.util.Scanner;
public class Q05{
	Scanner sc = new Scanner(System.in);
	public void opr(){
		System.out.println("Enter one number : ");
		int num = sc.nextInt();
		for(int i = 0 ; i <= num ; i++){
			System.out.println(num+" x "+i+" = "+(num * i));
		}
	}
	
	
	public static void main(String x[]){
		Q05 obj = new Q05();
		obj.opr();
	}
}