/*
Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find sum of divisors and compare with the number, then count.

*/


public class Q09{
	public static void main(String x[]){
	int arr[] = {6, 28, 10, 12, 496};	
	int divisorCount = 0;
	System.out.print("arr = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	
	
	
	System.out.println();
	
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = 1 ; j < arr[i]; j++){
			if(arr[i]%j == 0){
				divisorCount++;
			}
		}
		
	}
	
	System.out.println("Count of Perfect numbers = "+divisorCount);
	
	}
}

