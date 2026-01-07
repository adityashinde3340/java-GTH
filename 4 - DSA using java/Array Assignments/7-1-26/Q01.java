/*
Q1. Given an integer array and a number K, find the length of the longest continuous subarray whose sum is less than or equal to K.
Explanation:
Use two pointers (start, end)
Expand the window by moving end
If sum > K, shrink window from start
Track maximum window length
Input :- arr = [2, 1, 5, 1, 3, 2]		K = 7
Output :- 4
*/

public class Q01{
    public static void main(String args[]){
	      int []arr ={2, 1, 5, 1,3,2};
		  int k =7;
		  int sum=0;
		  int max=0;
		  int start =0;
		  for(int i=0;i<arr.length;i++){
		     sum +=arr[i];//2+1=3=3+5=8
			  while(sum>k){	 
				  sum-=arr[start];
				  start++;
				  
			  }
			   max =Math.max(max,(i-start+1));//
			 
		  }
		  System.out.println("the max length is "+max);
	}
}