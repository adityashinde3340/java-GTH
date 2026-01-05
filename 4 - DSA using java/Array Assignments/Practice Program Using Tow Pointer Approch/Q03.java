/*
Q3. Reverse an Integer Array In-Place
Problem Statement
Reverse an integer array without using extra space.
Two Pointer Explanation
Start pointer at index 0, end pointer at n-1.


Swap elements at both pointers.

Move pointers toward the center.

Logical Operations Used
Swap using temporary variable

Loop termination condition

Index manipulation

*/
import java.util.*;
public class Q03{
	public static void main(String x[]){
	
	
	int arr[] = {10, 20, 30, 40, 50};

        int i = 0;                  
        int j = arr.length - 1;     

        while (i < j) {
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;    
            j--;    
        }

        // print reversed array
        System.out.print("Reversed Array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
	
	
	
	
	
	
	
	
	
	
	}
}