import java.util.Scanner;
public class Q07{
	public static void main(String x[]){
	/*
	Q7. Write a java program to display the reverse array.

	Input : Array = {1, 2, 3, 4, 5}
	Output : Reverse array = {5, 4, 3, 2, 1}
	Explanation :
	The last element becomes the first, and the first becomes the last by traversing from the end to the start.
    */	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a size : ");
	int size = sc.nextInt();
	
	
	int arr[] = new int[size];
    System.out.println("Enter array elements : ");
	  for(int i = 0 ; i < arr.length ; i++){
		  arr[i]=sc.nextInt();
	  }
	
	System.out.println();
	
	System.out.print("Reversed Array = ");
	
	for(int i = (arr.length - 1); i >= 0 ; i--){
		System.out.print(arr[i]+" ");
	}
	
	}
}