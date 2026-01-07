import java.util.Scanner;
public class Q10{
	public static void main(String x[]){
	/*
	Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5

	*/	
	Scanner sc = new Scanner(System.in);
	int arr[] = {1,2,3,4,5};
	System.out.print("array = ");
	for(int i = 0; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Input the position where to delete : ");
	int checkElement = sc.nextInt();
	
	System.out.println();
	for(int i = 0; i < arr.length ; i++){
		if(i == checkElement){
			continue;
		}
		System.out.print(arr[i]+" ");
	}
	}
}