/*
Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
 
*/
public class Q04{
	public static void main(String x[]){
	int arr[] = {1, 2, 3, 2, 1};
	System.out.print("given arr = ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
	System.out.println();
    boolean flag = false;
    for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] == arr[(arr.length - i) - 1]){
			flag = true;
		}
		else{
			flag = false;
		}
	}  
     
	System.out.println();
	System.out.print("Forward : ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
	System.out.println();	
	
	System.out.print("Backward : ");
	
	for(int i = arr.length -1 ; i >= 0 ; i--){
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();	
	
	if(flag){
		System.out.println("Since both are the same, the array is a palindrome.");
	}
	else{
		System.out.println("not a palindrome");
	}
	
	
	
	}
}