import java.util.Scanner;
public class Q03{
	public static void main(String x[]){
	/*
	3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9

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
	System.out.print("Arr = ");
	for(int i = 0 ; i < arr.length; i++){
		System.out.print(arr[i]+" ");
	}	
	System.out.println();
	System.out.print("Enter position to rotate : ");
	int posRotation = sc.nextInt();
	
    System.out.println();
	System.out.println("After Rotation : ");
	
	for(int i = posRotation ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
    
	for(int i = 0 ; i < posRotation ; i++){
		System.out.print(arr[i]+" ");
	}
	}	
}