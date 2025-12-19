import java.util.Scanner;
public class Q01{
   public static void main(String x[]){
   /*Q1. Write a Java program to input an array & display it.
   Input:
   Array Size = 5
   Array Elements = 10 20 30 40 50
   Output:
   10 20 30 40 50
   Explanation:
   First, we take the size of the array from the user.
   Then, elements are entered one by one into the array.
   Finally, using a loop, we display all elements in the same order they were entered.
   */
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Enter array elemenets : ");
	int arr[] = new int[size];
	
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
    
	System.out.println();
	
	for(int i = 0 ; i < arr.length ; i++){
		System.out.println(i+" = "+arr[i]);
	}

    

	}
}