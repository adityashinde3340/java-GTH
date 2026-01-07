/*
Q3. Write a java program to Find the window of size K whose elements have the highest sum.
Input:
 arr = {4, 2, 10, 3, 8, 6}
 K = 2
Output:	13
Explanation:
Window {10,3} → sum = 13

*/

public class Q03 {
    public static void main(String x[]) {

        int arr[] = {4, 2, 10, 3, 8, 6};
        int k = 2;
        int sum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            sum = 0;

            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Max sum = " + maxSum);
    }
}