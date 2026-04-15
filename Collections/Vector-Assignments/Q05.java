/*
Q5. Write a Java program to find the maximum element in a Vector.
Description
Store integer values.
Assume first element as max.
Compare with remaining elements.
Print maximum value.
Input
Enter elements:
12
45
7
89
34
Output
Maximum element is 89

*/
import java.util.*;
public class Q05{
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
      
      int max = v1.get(0);
      
      for(int i = 1 ; i < v1.size() ; i++){
        if(max < v1.get(i)){
           max = v1.get(i);
        }
      }
      
      System.out.println("max = "+max);
      
  }
}
