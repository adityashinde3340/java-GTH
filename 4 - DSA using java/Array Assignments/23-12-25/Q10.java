/*
Q10. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.

*/

import java.util.Scanner;
public class Q10{
	public static void main(String x[]){
	
	int arr[] = {2, -3, 4, -1, 5};
	System.out.print("arr = ");
	for(int i : arr){
		System.out.print(i+" ");
	}
	
	
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] < 0){
			arr[i] = 0;
		}
	}
	
	System.out.println();
	System.out.print("arr = ");
	for(int i : arr){
		System.out.print(i+" ");
	}
	
	
	}
}