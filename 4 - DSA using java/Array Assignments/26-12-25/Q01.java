/*

Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.

*/

public class Q01{
	public static void main(String x[]){
	int arr[] = {3, 6, 7, 9, 10};
	
	
	System.out.print("Arr = ");
	for(int i : arr){
		System.out.print(i+" ");
	}
	System.out.println();
	
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] % 3 == 0){
			arr[i] = -1;
		}
	}
	System.out.println();
	
	System.out.print("Arr = ");
	for(int i : arr){
		System.out.print(i+" ");
	}
	
		
	}
}