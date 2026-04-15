/*

Q2. Write a Java program to store N elements in a Vector and print the total number of elements.
Description
Create Vector.
Take number of elements from user.
Store values.
Use size() method to find total elements.
Input
Enter number of elements:
4

Enter elements:
5
15
25
35
Output
Total elements in vector = 4

*/
import java.util.*;
public class Q02{
   
   public static void main(String x[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of elements: ");
      int size = sc.nextInt();
      Vector<Integer> v = new Vector<>(size , 2);
      System.out.println("Enter elements in java : ");
      for(int i = 0 ; i < size;i++){
          int data = sc.nextInt();
          v.add(data);
      }      
  
      for(int i = 0 ; i < v.size(); i++){
         System.out.print(v.get(i)+" ");
      }
   }
}
