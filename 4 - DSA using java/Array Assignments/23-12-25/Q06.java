import java.util.Scanner;
public class Q06{
	public static void main(String x[]){
	/*
	Q6. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
	Explanation:
	All non-zero elements [1, 3, 12] retain their original order.
	All zeros are moved to the end of the array.

	*/
	
	int arr[] = {0, 1, 0, 3, 12};
	
	System.out.println();
	System.out.print("Arr = ");
	for(int i = 0 ; i < arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	int start = 0 ;
	int end = arr.length;
	int zeroCount = 0;
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] == 0){
			zeroCount++;
		}
	}
	

	
	System.out.println();
	int index = 0;
	 for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
		
	while(index < arr.length) {
            arr[index] = 0;
            index++;
    }
	
	
    System.out.println();
	System.out.print("Arr = ");
	
	for(int i = 0 ; i < arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	
	
	}
}