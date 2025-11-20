//Q4. Check whether a number is a palindrome using a do-while loop.
//	→ Input: 121 → Output: Palindrome


import java.util.Scanner;
public class Q04{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int temp = num;
	int count = 0 , final_num = 0 , negtive_check = 0;
	
     	if (temp == 0){
				System.out.println("number = 0");
		}
        else if(temp < 0){
			negtive_check = temp * -1;
			temp = negtive_check;
		}		
		else{
			do {
				count = temp % 10;
				temp = temp / 10;
                final_num = final_num * 10 + count;				
			}
			while(temp > 0);
			if(final_num == num){
				System.out.println(num+" is palindrome");
			}
			else{
				System.out.println(num+" is not palindrome");
			}
		}
	
    }	
}