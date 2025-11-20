//Q26. Write a java program to Check Number Is Spy Number or Not.
//Example :
//A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
//     Input : 1412
//     Output : Spy Number 

//Explanation :
//sum = (1 + 4 + 1 + 2) = 8
//product = (1 * 4 * 1 * 2) = 8
//since, sum == product == 8

import java.util.Scanner;
public class PR26{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number : ");
        int num = sc.nextInt();
        
        int temp = num;   // Store original number
        int sum = 0, product = 1;
        
        while(temp > 0){
            int digit = temp % 10;
            temp = temp / 10;
            sum = sum + digit;
            product = product * digit;
        }
        
        if(sum == product){
            System.out.println(num + " is a Spy number");
        }
        else{
            System.out.println(num + " is not a Spy number");
        }
        
        sc.close();
    }
}
