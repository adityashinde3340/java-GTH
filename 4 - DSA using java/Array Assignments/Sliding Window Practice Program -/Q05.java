/*
Q5. Write a java program to count how many subarrays of size K have sum greater than X.
Input:
 arr = {2, 1, 5, 1, 3, 2}
 K = 3, X = 7
Output:
 2
Explanation:
{2,1,5} → 8 
{1,5,1} → 7 
{5,1,3} → 9 
{1,3,2} → 6 
Total = 2
*/

public class Q05{
	public static void main(String args[]){
	int k = 3 , x = 7 , count=0, sum ;
	int arr[] = {2, 1, 5, 1, 3, 2};
	
	
	for(int i = 0 ; i < (arr.length - 1);i++){
		sum = 0;
		for(int j = i; j < (k+i); j++){
		    sum = sum + arr[j];
			if(sum > x)
				count++;
		}
	}
	
	System.out.println("total = "+count);
    }	
}
