import java.util.Scanner;

public class ARR{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int size = sc.nextInt();	
	int arr[] = new int[size];
	System.out.println("Size = "+arr.length);
	System.out.println();
	
	
	System.out.println("Enter elements in java : ");
	for(int i = 0 ; i <= arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
    System.out.println();	
	
	for(int i = 0 ; i <= arr.length ; i++){
	   System.out.println(arr[i]);
	}	
	
	}
}