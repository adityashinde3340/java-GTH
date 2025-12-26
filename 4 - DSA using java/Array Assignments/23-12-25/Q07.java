import java.util.Scanner;
public class Q07{
	public static void main(String x[]){
	/*
	Q7.Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
	Output :- 3
	Explanation:
	Pairs whose sum = 6 are:
	(1, 5) → first occurrence
	(7, -1)
	(1, 5) → second occurrence (from the second 5)
	Total pairs = 3
    */
	int sum = 6;
	int matchCount = 0;
	int arr[] = {1, 5, 7, -1, 5};
	System.out.print("arr = ");
	      for(int i = 0 ; i < arr.length ; i++){
		        System.out.print(arr[i]+" ");
	      }
	
	System.out.println();
	
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i+1 ; j < arr.length ; j++){
			if(arr[i]+arr[j] == sum){
				matchCount++;
			}
		}
	}
	 
	 System.out.println("Total pairs = "+matchCount); 
   
   }
}