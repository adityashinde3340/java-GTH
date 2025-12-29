/*
Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.



*/

public class Q06{
	public static void main(String x[]){
	int arr[] = {2, 4, 6, 8};
	int square[] = new int[arr.length];
	int index = 0;
	System.out.print("arr = ");
		for(int i = 0 ; i < arr.length ; i++){
		    System.out.print(arr[i]+" ");
		}
	
	
	System.out.println();
	
	
	    for(int i = 0 ; i < arr.length ; i++){
			square[index] = (arr[i] * arr[i]);
			index++;
		}
	System.out.print("newArr = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(square[i]+" ");
	}
	
	}
}