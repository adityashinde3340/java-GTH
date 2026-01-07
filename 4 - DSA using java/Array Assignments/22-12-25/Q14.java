import java.util.Scanner;
public class Q14{
	public static void main(String x[]){
	    /*Q14.  Write a java program to remove duplicated values from arrays.
        Input : Array = {10, 20, 20, 30, 40, 40, 50}
        Output : Unique elements = {10, 20, 30, 40, 50}
        Explanation:
        Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.*/
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Input 5 elements in the array : ");
	int arr[] = new int[size];
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	System.out.println();
	
	boolean flag = false;
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i+1 ; j < arr.length ; j++){
			if(arr[i] == arr[j]){
			    arr[j]=-1;
			}
			
	       
		}
	}
	
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i]!=-1)
		System.out.print(arr[i]+" ");
	}
	}
}