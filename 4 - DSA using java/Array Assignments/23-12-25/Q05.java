import java.util.Scanner;

public class Q05{
	public static void main(String []args){
	/*
	Q5. Write a Java program to sort a given array in ascending & descending order.

	Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
	Descending Order: [34, 12, 9, 5, 1]

	Explanation:
	Sorting means arranging elements in a particular order.
	In ascending order, numbers are arranged from smallest to largest.
	For example: 1 < 5 < 9 < 12 < 34.
	In descending order, numbers are arranged from largest to smallest.
	For example: 34 > 12 > 9 > 5 > 1.
	The program should first sort the array in ascending order, then print the reverse of that order for descending.

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
    int temp = 0;
	for(int i = 0 ; i < arr.length; i++){
		if(arr[i] > arr[i+1]){
		
	}
	System.out.println();
	System.out.print("Arr = ");
	for(int i = 0 ; i < arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	}
}