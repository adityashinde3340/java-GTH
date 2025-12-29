//Q10. Count the number of duck numbers in an array.

import java.util.*;
public class Q10{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Enter array elemenets : ");
	int arr[] = new int[size];
	int count = 0;
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
    
	System.out.println();    

		for(int i = 0 ; i < arr.length ; i++){
		    int n = arr[i];
			while(n > 0){
				if(n % 10 == 0){
					count++;
					break;
				}
				n = n / 10;
			}
		}
		System.out.println("count of duck numbers are "+count);
	}	
}
