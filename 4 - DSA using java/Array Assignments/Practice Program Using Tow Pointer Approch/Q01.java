/*
Practice Program Using Tow Pointer Approch 
Q1. Check Whether an Integer Array Is a Palindrome
Problem Statement
Given an integer array, determine whether it reads the same from left to right and right to left.
Two Pointer Explanation
Use one pointer at the start and one at the end.


Compare elements at both pointers.


Move both pointers inward if elements match.


If any mismatch occurs, the array is not a palindrome.


Logical Operations Used
Equality comparison


Pointer increment & decrement


Loop control logic

*/

import java.util.Scanner;
public class Q01{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Enter array elemenets : ");
	int arr[] = new int[size];
	int count = 0;
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
    
	System.out.println();  

	boolean res = false;
	
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[0] == arr[(arr.length - 1) - i]){
			res = true;
		}
	}
	
	if(res){
		System.out.println("array is palindrome");
	}
	else{
		System.out.println("array is not palindrome");
	}
	
	}
}