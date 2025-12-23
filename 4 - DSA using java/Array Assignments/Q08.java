import java.util.Scanner;
public class Q08{
	public static void main(String x[]){
		/*
	Q8. Write a java program to find missing elements in an array.
	Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
	Output : Missing elements = {3, 6}
	Explanation:
	Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.

		*/
    Scanner sc = new Scanner(System.in);
	
	
    int arr[] = {1 , 2 , 4 , 5 , 7};
	int max = arr[arr.length -1];
	int min = arr[arr.length - arr.length];
	
	System.out.print("Array = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();	
    
    
	System.out.print("Missing elements = ");
	
	System.out.println();
	
	
	
	
	
	
	}
}