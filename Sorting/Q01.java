import java.util.Scanner;
public class Q01{
	public static void main(String x[]){
	//selection sort
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array : ");
	int size = sc.nextInt();
	System.out.println();
	
	int arr[] = new int[size];
	System.out.print("Enter array elements : ");
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	
	
	for(int i = 0 ; i < arr.length; i++){
		for(int j = i+1 ; j < arr.length ; j++){
			if(arr[i] > arr[j]){
			    int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}	
		}
	}
	
	
	System.out.print("sorted array : ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(" "+arr[i]);
	}
	
	
	}
}