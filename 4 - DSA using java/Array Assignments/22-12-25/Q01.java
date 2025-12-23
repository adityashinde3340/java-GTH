import java.util.Scanner;
public class Q01{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	// WAP to insert at desire position
    int arr[] = {11,22,33,44,55};
	System.out.print("arr = ");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(i+" ");
	}
	System.out.println();
	
	System.out.println("Enter position : ");
	int pos = sc.nextInt();
	
	System.out.println("Enter vlaue : ");
	int val = sc.nextInt();
	}
}