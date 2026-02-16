/*Q6. Count Number of Valid Mirror Pairs
Problem Statement
Count how many pairs from start and end have equal values.
Two Pointer Explanation
Compare elements from both ends.


If equal, increase count.
Move pointers inward.


Logical Operations Used
Equality check


Counter increment
Pointer logic*/


import java.util.Scanner;
public class Q06{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	
	System.out.println("enter array elements for size 5 : ");
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	int count = 0;
	int start = 0;
	int end = (arr.length-1);
	
	
	
	for(start = 0;start < arr.length ; start++){
		if(arr[start] == arr[end]){
			count++;
		}
		end--;
	}
	
	System.out.println(" "+count);
	
	}
}

