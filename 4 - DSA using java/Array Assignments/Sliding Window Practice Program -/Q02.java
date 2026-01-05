/*
Input:
 arr = {1, 2, 3, 4, 5}
 K = 2
Output:
 3 5 7 9
*/

public class Q02{
	public static void main(String x[]){
    int k = 2 , sum;
	int arr[] = {1,2,3,4,5};
	
    for(int i = 0 ; i < (arr.length-1) ; i++)
    {
		sum = 0;
		for(int j = i; j<(i+k);j++)
		{
			sum = sum + arr[j];
			
		}
		System.out.println(sum+" ");
	}		

	
	}
}

