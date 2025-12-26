import java.util.Scanner;
public class Q02{
	public static void main(String x[]){
		
	/*
	Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array

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
	
	int mejorityCount = arr.length / 2;
	int numCount = 1;
	boolean isFound = false;
	
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i+1 ; j < arr.length ; j++){
			if(arr[i] == arr[j]){
				numCount++;
			}
		}
	}
	
	System.out.println();
	if(numCount > mejorityCount){
		isFound = true;
	}
	
	if(isFound){
		System.out.println("There is Majority Elements in the given array");
	}
	else{
		System.out.println("There are no Majority Elements in the given array");
	}

	}
}