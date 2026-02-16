import java.util.Scanner;
public class Q02{
	public static void main(String x[]){
	//bubble sort 
    
    Scanner sc = new Scanner(System.in);
    System.out.println();


    System.out.println("Enter size : ");
    int size = sc.nextInt();
	System.out.println();
	
    int arr[] = new int[size];
	
    System.out.print("Enter array elements : ");
    for(int i = 0 ; i < arr.length; i++){
		arr[i] = sc.nextInt();
	}	
	System.out.println();
	for(int i = 0 ; i < arr.length ; i++){
		for(int j = 0 ; j < (arr.length-i-1); j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
	}
	
	System.out.print("array elements : ");
    for(int i = 0 ; i < arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	
	}
}