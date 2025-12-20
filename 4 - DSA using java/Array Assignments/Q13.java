import java.util.Scanner;
public class Q13{
	public static void main(String x[]){
	/*
	Q13. Write a java program to display only non-zero values from an array.
	Input : Array = {1, 0, 5, 0, 7, 0, 9}
	Output : Non-zero elements = {1, 5, 7, 9}
	Explanation :
	Traverse the array and print only elements that are not equal to zero.

	*/
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Input 5 elements in the array in ascending order");
	int arr[] = new int[size];
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	    for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] == 0){
			continue;
		}
		System.out.print(arr[i]+" ");
	    }
	}
}