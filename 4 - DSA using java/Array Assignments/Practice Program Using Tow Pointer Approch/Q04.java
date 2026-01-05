/*
Q4. Separate Even and Odd Numbers
Problem Statement
Rearrange an array so that all even numbers come first and odd numbers later.
Two Pointer Explanation
Left pointer finds odd number.

Right pointer finds even number.
Swap them.
Continue until pointers cross.
Logical Operations Used
Modulus operator
Conditional swapping
Pointer movement
*/
public class Q04{
	public static void main(String x[]){
	
	int arr[] = {12 , 15 , 20, 7 , 4};
	
    int i = 0 ;  
    int j = (arr.length - 1);
    
	System.out.print("array before = ");
	for(int a = 0 ; a < arr.length ; a++){
		System.out.print(arr[a]+" ");
	}
	
	// logic 
	
	
    while(i < j){
			if (arr[i] % 2 == 0) {
                i++;
            }
          
            else if (arr[j] % 2 != 0) {
                j--;
            }
        
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
		}
	}	
		
	System.out.println();
	
	
	System.out.print("array after = ");
	for(int a = 0 ; a < arr.length ; a++){
		System.out.print(arr[a]+" ");
	}
	
	}
}
