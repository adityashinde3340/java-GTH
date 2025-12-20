import java.util.Scanner;
public class Q09{
	public static void main(String x[]){
	/*
	Q9. Write a java program to copy one array to another array.
	Input : Array1 = {5, 10, 15, 20}
	Output : Array2 = {5, 10, 15, 20}
	Explanation:
	Copy each element of Array1 into Array2 using index-by-index assignment.

	*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array : ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter array elemensts : ");
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	int newArr[] = new int[size];
	
	for(int i = 0 ; i < newArr.length ; i++){
		newArr[i] = arr[i]; 
	}
	
	System.out.println();
	System.out.print("array = ");
	for(int i = 0 ; i < newArr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.print("new array = ");
	for(int i = 0 ; i < newArr.length ; i++){
		System.out.print(newArr[i]+" ");
	}
	}
}