/*
Q1. Given an integer array and a number K, find the length of the longest continuous subarray whose sum is less than or equal to K.
Explanation:
Use two pointers (start, end)
Expand the window by moving end
If sum > K, shrink window from start
Track maximum window length
Input :- arr = [2, 1, 5, 1, 3, 2]		K = 7
Output :- 4
*/

public class Q01{
	public static void main(String x[]){
	int arr[] = {2, 1, 5, 1, 3, 2};
	int k = 7;
	int sum, count = 0;
	
	System.out.print("Arr = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
 	for(int i = 0 ; i < arr.length; i++){
		for(int j = i ; j < (i-k) ; j++){
		}	
	}	
	
	System.out.println(" = "+count);
	
	
	}
}
