/*
Q2. Count Pairs With Equal Sum from Ends
Problem Statement
Given an integer array, count how many pairs from both ends have equal sum.
Two Pointer Explanation
Place one pointer at the beginning and one at the end.


Calculate the sum of both elements.

If sum matches required condition, increase count.

Move pointers accordingly.

Logical Operations Used
Addition

Comparison operators

Conditional branching

*/

public class Q02{
	public static void main(String x[]){
	 int arr[] = {1, 3, 4, 5, 6, 8};
        int count = 0;
        int target = 9;

        int i = 0;                 // left pointer
        int j = arr.length - 1;    // right pointer

        while (i < j) {

            int sum = arr[i] + arr[j];   // Addition

            if (sum == target) {         // Comparison
                count++;
                i++;                     // Move both pointers
                j--;
            }
            else if (sum < target) {
                i++;                     // Increase sum
            }
            else {
                j--;                     // Decrease sum
            }
        }

        System.out.println("Total pairs = " + count);
	}
}