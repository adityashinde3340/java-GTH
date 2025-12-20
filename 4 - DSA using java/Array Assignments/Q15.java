import java.util.Scanner;
public class Q15{
	public static void main(String x[]){
	/*
	Q15. Write a java program to find common elements between two arrays.
	Input:
	Array1 = {1, 2, 3, 4, 5}
	Array2 = {3, 4, 5, 6, 7}
	Output : Common elements = {3, 4, 5}
	Explanation:
	Compare each element of Array1 with all elements of Array2, if match found → it is a common element.

	*/	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of first array : ");
	int size = sc.nextInt();
	
	System.out.println("Input 5 elements in the array first array : ");
	int arr[] = new int[size];
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Enter size of second array: ");
	int size2 = sc.nextInt();
	
	System.out.println("Input 5 elements in the second array : ");
	int arr2[] = new int[size2];
	for(int i = 0 ; i < arr2.length ; i++){
		arr2[i] = sc.nextInt();
	}
	
	
	System.out.println();
	System.out.print("Array 1 = ");
	for(int i = 0 ; i < arr.length ; i++){
	    System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	System.out.print("Array 2 = ");
	for(int i = 0 ; i < arr2.length ; i++){
	    System.out.print(arr2[i]+" ");
	}
	System.out.println();
	System.out.print("duplicate values = ");
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = 0 ; j < arr2.length ; j++){
			if(arr[i]==arr2[j]){
				System.out.print(arr2[j]+" ");
			}
		}
	}
	
	}
}