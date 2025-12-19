import java.util.Scanner;
public class Q06{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	/*Input:
	Array = {10, 20, 30, 40, 50}
	Element to search = 30
	Output : Element 30 found at index 2
	*/
	
    System.out.println("Enter a size : ");
	int size = sc.nextInt();
	
	
	int arr[] = new int[size];
    System.out.println("Enter array elements : ");
	for(int i = 0 ; i < arr.length ; i++){
		arr[i]=sc.nextInt();
	}
	
	System.out.println();
	System.out.println("Element to search : ");
	int seachElement = sc.nextInt();
	System.out.println();
	for(int i = 0 ; i < arr.length ; i++){
		if(seachElement == arr[i]){
			System.out.println("Element "+seachElement+" found at index "+i);
		}
	}
	
	}
}