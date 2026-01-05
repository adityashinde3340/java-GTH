/*
Q1. Write a java program to Check if any subarray of size K has sum equal to Target.
Input:
arr = {1, 4, 2, 10, 23, 3, 1, 0, 20}
K = 4, Target = 39
Output:
Yes
Explanation:
Window {4,2,10,23} → sum = 39

*/
public class Q01{
	public static void main(String x[]){
	
	int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
	int k = 4 , target = 39 , sum ;
	int count = 0;
	
	for(int i = 0 ; i < (arr.length-k); i++){
	    sum =0;
		for(int j = i; j<(k+i);j++){
			sum = sum + arr[j];
		}
		if(sum == target){
			count++;
		}
	}
	System.out.println("number of windows sum matched = "+count);
	
	}
}