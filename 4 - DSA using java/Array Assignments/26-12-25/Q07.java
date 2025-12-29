/*
Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.

*/

public class Q07{
	public static void main(String x[]){
	int[] arr = {3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int fact = 1;

            for (int j = 1; j <= num; j++) {
                fact = fact * j;
            }

            arr[i] = fact; // replace element with factorial
        }

        // Print updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}