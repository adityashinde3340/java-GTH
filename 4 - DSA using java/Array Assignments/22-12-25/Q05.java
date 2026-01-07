import java.util.Scanner;
public class Q05{
	public static void main(String x[]){
	/*
	Q5. Write a Java program to count even & odd values from an array.
    Input:
    Array Size = 7
    Array Elements = 12 17 24 39 40 55 70
	Output:
	Count of Even Values = 4
	Count of Odd Values = 3

	*/	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Enter array elemenets : ");
	int arr[] = new int[size];
	
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
    
	System.out.println();
	
	int evenCount  = 0  , oddCount = 0 ;
	for(int i  = 0 ; i < arr.length ; i++){
	   if(arr[i]%2 == 0){
		   evenCount++;
	   }
	   else{
		   oddCount++;
	   }
	}
	System.out.println();
	System.out.println("Count of Even Values = "+evenCount);
	System.out.println("Count of Odd Values = "+oddCount);
	
	}
}