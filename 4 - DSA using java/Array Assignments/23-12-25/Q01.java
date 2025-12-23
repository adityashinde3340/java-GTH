import java.util.Scanner;
public class Q01{
	public static void main(String x[]){
	/*
	Q1. Write a java program to count the frequency of each element in a given array.
	Input:
	Array = {1, 2, 2, 3, 3, 3, 4}
	Output:
	1 → 1 time
	2 → 2 times
	3 → 3 times
	4 → 1 time
	Explanation:
	For each element, count how many times it occurs in the array using nested traversal.

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
	int numCount = 1;
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i+1 ; j < arr.length ; j++){
			if(arr[i] == arr[j]){
				numCount++;
				arr[j] = -1;
			}
			
		}
		
		if(arr[i]!=-1){
			System.out.println(arr[i]+" -> "+numCount+" times");	
		}
		//System.out.println(arr[i]+" -> "+numCount+" times");
		numCount = 1;
	}
	}
}