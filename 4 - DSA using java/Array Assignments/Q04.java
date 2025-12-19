import java.util.Scanner;
public class Q04{
	public static void main(String x[]){

    /*
    Q4. Write a Java program to display even & odd index values from an array.
    Input:
    Array Size = 6
    Array Elements = 5 10 15 20 25 30
    Output:
    Values at Even Index = 5 15 25
    Values at Odd Index = 10 20 30

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
	System.out.print("Values at Even Index = ");
	for(int i = 0 ; i < arr.length ; i++){	
		if(i%2 == 0){
			System.out.print(arr[i]+" ");
		}
	}
    System.out.println();
	System.out.print("Values at Odd Index = ");
	for(int i = 0 ; i < arr.length ; i++){	
		if(i%2 != 0){
			System.out.print(arr[i]+" ");
		}
	}
		
	}
}