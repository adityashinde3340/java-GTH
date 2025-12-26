/*
Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/

public class Q02{
	public static void main(String x[]){
		
	int arr[] = {5 , 3 , 7 , 2};
	System.out.print("arr = ");
	
	for(int i = 0 ; i <arr.length ; i++){
		System.out.print(" "+arr[i]);
	}
	
	System.out.println();
	
    for(int i = 0 ; i < arr.length ; i++){
		if(i == 0  || i == (arr.length - 1)){
			arr[i] = 0;
		}
		  
	}
	
		System.out.println();
	
	System.out.print("arr = ");
	
	for(int i = 0 ; i <arr.length ; i++){
		System.out.print(" "+arr[i]);
	}
	
	
	}
}