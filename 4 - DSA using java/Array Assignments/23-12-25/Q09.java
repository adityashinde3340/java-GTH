/*
Q9.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.

*/
import java.util.Scanner;
public class Q09{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	int arr[] = {1, 2, 3, 4, 5, 6 };
	System.out.print("Arr = ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	System.out.println();

    int even[] = new int[arr.length / 2];
    int odd[] = new int[arr.length / 2];
	int ee = 0;
	int  oo = 0;
	for(int i = 0 ; i < arr.length ; i++){
	    if(arr[i] % 2 == 0){
		    even[ee++] = arr[i];
		}	
		else{
			odd[oo++] = arr[i];
		}
	}
	
    int index = 0;
        for (int i = 0; i < even.length; i++) {
            arr[index++] = even[i];
            arr[index++] = odd[i];
        }
		
	System.out.print("Arr = ");	
	for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
		
  
	}
	
	
}