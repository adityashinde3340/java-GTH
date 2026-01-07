import java.util.Scanner;
public class Q11{
	public static void main(String x[]){
	/*
	Q11. Write a java program to give an array, find the second largest element.
	Input : Array = {12, 35, 1, 10, 34, 1}
	Output : Second largest = 34
	Explanation:
	First largest is 35, second largest is the next maximum (34). 
	We maintain two variables (largest, secondLargest).
	*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Enter array elemenets : ");
	int arr[] = new int[size];
	for(int i = 1 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	System.out.println();
	int max = arr[0];
	for(int i = 1 ; i < arr.length ; i++){
		if(max < arr[i]){
			max = arr[i];
		}
	}
	System.out.print("max = "+max);
	
	}
}