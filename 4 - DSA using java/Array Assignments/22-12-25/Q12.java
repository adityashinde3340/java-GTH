import java.util.Scanner;
public class Q12{
	public static void main(String x[]){
    /*
	Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5

	*/	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Input 5 elements in the array in ascending order");
	int arr[] = new int[size];
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	System.out.print("Input the position where to insert : ");
	int pos = sc.nextInt();
	System.out.print("Value : ");
	int val = sc.nextInt();
	
	System.out.print("The new list is : ");
	for(int i = 0 ; i < arr.length ; i++){
		if(pos == i){
			arr[i] = val;
		}
	}
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
	}
}