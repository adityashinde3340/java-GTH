/*

Q8. Write a Java program to count how many even numbers are present in a Vector.
Description
Store integer values.
Traverse using loop.
Check number % 2 == 0.
Count even numbers.
Input
Enter elements:
10
15
20
25
30
Output
Total even numbers = 3

*/
import java.util.*;
public class Q08{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of vector : ");
      int size = sc.nextInt();
      
      Vector<Integer> v1 = new Vector<>(size , 2);
      System.out.println("Enter data in vector of size  "+size+" : ");
      for(int i = 0 ; i < size;i++){
        int data = sc.nextInt();
        v1.add(data);
      }  
      
      int evenCount = 0;
      for(int i = 0 ; i < v1.size(); i ++){
         if(v1.get(i) % 2 == 0){
            evenCount++;
         }
      }
      
     System.out.println("Total even numbers = "+evenCount); 
   }
}
