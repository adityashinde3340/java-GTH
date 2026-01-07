/*
Q3. Write a java program to Count how many subarrays of size K have sum divisible by 3.
Explanation:
Maintain window sum
Check sum % 3 == 0 for each window


Input :- arr = [3, 6, 2, 4, 7]	K = 2
Output :- 2

*/

public class Q03{
	public static void main(String x[]){
	int arr[] = {3, 6, 2, 4, 7};
	int k = 2 , sum = 0;
    int start = 0 , count = 0;
	
	for(int i = 0 ; i < arr.length ; i++){
        sum = 2;
		for(start = i ; start < (arr.length-1) ; start++){
			sum = sum + arr[i];
		}
		if(sum % 3 == 0){
			start = i;
			count++;
		}
	}
	System.out.print(sum+" ");
	}
}