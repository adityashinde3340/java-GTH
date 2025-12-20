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
	//System.out.println("Enter a size : ");
	//int size = sc.nextInt();
	
    int arr[] = {1 , 2 , 4 , 5 , 7};
	int max = arr[arr.length -1];
	int min = arr[arr.length - arr.length];
	//int arr[] = new int[size];
    //System.out.println("Enter array elements : ");
	  //for(int i = 0 ; i < arr.length ; i++){
		 // arr[i]=sc.nextInt();
	  //}
	System.out.print("Array = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();	
    
    boolean flag = false;
	System.out.print("Missing elements = ");
	
	System.out.println();
	
	for(int i = min ; i <= max ; i++)
	{
		for(int j = 0 ; j < arr.length ; j++){
	     if(i == arr[j]){
			 break;
		
		 }
		 //System.out.print(i+" "); 
		}
		
		if(!flag){
			System.out.print(i+" ");
		}
	}
	
	
	
	
	}
}