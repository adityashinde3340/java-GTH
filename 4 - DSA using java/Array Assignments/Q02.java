import java.util.Scanner;
public class Q02{
	public static void main(String x[]){
	/*
	Q2. Write a Java program to calculate the sum of all elements in an array.
    Input:
    Array Size = 5
    Array Elements = 2 4 6 8 10
    Output:
    Sum of array elements = 30
    Explanation:
    Initialize a variable sum = 0.
    Traverse the array and keep adding each element to sum.
    After the loop ends, sum will hold the total of all array elements.

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
	int sum = 0;
	for(int i = 0 ; i < arr.length ; i++){
		
		sum = sum + arr[i];
	}
	System.out.println("Sum = "+sum);
	}
}