/*
Q6. Write a Java program to store integer elements in a Vector and display the first and last element.
Description
Create a Vector.
Store elements using add() method.
Use firstElement() and lastElement() methods.
Print both values.
Input
Enter number of elements:
5

Enter elements:
11
22
33
44
55
Output
First element = 11
Last element = 55
*/
import java.util.*;
public class Q06{
  public static void main(String x[]){
  Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of vector : ");
      int size = sc.nextInt();
      
      Vector<Integer> v1 = new Vector<>(size , 2);
      System.out.println("Enter data in vector of size "+size+" : ");
      for(int i = 0 ; i < size;i++){
        int data = sc.nextInt();
        v1.add(data);
      }
      
      
      System.out.println("First Element = "+v1.get(0));
      System.out.println("Last Element = "+v1.get(v1.size() - 1));
  }
}
