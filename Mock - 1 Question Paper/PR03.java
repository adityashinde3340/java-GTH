/*Q3. Write a Java program to check whether a number
 is a multiple of both 3 and 5 using logical AND 
(&&) operator. 
Input: 15 
Output: Multiple of both 3 and 5 
*/

import java.util.Scanner;

public class PR03{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num : ");
    int num = sc.nextInt();
    if((num % 3 == 0) && (num % 5 == 0)){
		System.out.println(num+"Is Multiple of both 3 and 5 ");
	}	
	else{
		System.out.println(num+"Is not Multiple of both 3 and 5 ");
	}
	}	
}