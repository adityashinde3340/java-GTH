/*
Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.


*/
 
public class Q08{
	public static void main(String x[]){
         int arr[] = {2, 5, 6, 9, 11};
		 System.out.print("arr = ");
         for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		 }
		 
		 
		 System.out.println();
		 int primeCount = 0;
		 
		 for(int i = 0 ; i < arr.length ; i++){
			 if(arr[i] % arr[i] == 0 && arr[i] % 1 == 0){
				primeCount++;
			 }
		 }
		 System.out.println("count of prime numbers are = "+primeCount);
	}	
}