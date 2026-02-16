/*
 Q3. Write a java program to Count how many subarrays of size K have sum divisible by 3.
Explanation:
Maintain window sum
Check sum % 3 == 0 for each window
Input :- arr = [3, 6, 2, 4, 7]	K = 2
Output :- 2
*/
public class Q03
{
	public static void main(String []x){
		  int arr[] ={3,6,2,4,7};
		  int k =2;
		  int count =0;
		  int sum=0;
		  for(int i=0; i<k;i++){
			  sum +=sum+arr[i];
		  }
		  if(sum % 3 == 0){
			  count++;
		  }
		  for(int i =k; i<arr.length;i++){
			   sum =sum + arr[i]-arr[i-k];
			     if(sum % 3 == 0){
			          count++;
	        	  }
		  }
		  System.out.println("the total count is "+count);
	}
}