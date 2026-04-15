/*
Q10. Write a Java program to check whether a Vector is empty or not.
Description
Create a Vector.
Check using isEmpty() method.
Print appropriate message.
Input
Enter number of elements:
0
Output
Vector is empty

*/

import java.util.*;

public class Q10{
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
      
      boolean res = v1.isEmpty();
      if(res){
         System.out.println("Vector is Empty : ");
      }
      else{
        System.out.println("Vector is not Empty : ");
      }
  }
}
