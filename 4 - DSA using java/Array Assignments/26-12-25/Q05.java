/*

Q5. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5


Explanation:


Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.



*/

public class Q05{
	public static void main(String x[]){
		
    int arr[] = {10, 5, 3, 4, 3, 5, 6};		
	System.out.print("arr = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	
	int firstRep = 0;
	int rep[] = new int[arr.length];
	int index = 0;
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i+1 ; j < arr.length ; j++){
			if(arr[i] == arr[j]){
	
				rep[index] = arr[i];
				index++;
			}
			
		}
	}
	
	System.out.println();
	System.out.println("First repeating element is "+rep[0]);
	
	}
}