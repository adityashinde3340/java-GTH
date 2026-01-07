/*
Q2.Find the minimum length of a subarray whose sum is greater than or equal to K.
Explanation:
Expand window until sum ≥ K
Shrink from left to minimize window size
Input :- arr = [2, 3, 1, 2, 4, 3]	K = 7
Output :-  2
*/

class Q02{

    public static void main(String[] args) {
       
            int[] arr = {2, 3, 1, 2, 4, 3};
            int K = 7;
		    int start = 0;
            int sum = 0;
            
			
			int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {//
            sum += arr[end];//2

            while (sum >= K) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if( minLen == Integer.MAX_VALUE){
               minLen =0;
		}
		System.out.print("the minimum is "+minLen);
		
    
    }
}