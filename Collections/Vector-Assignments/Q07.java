/*
Q7. Write a Java program to update an element at a specific position in a Vector.
Description
Store elements in Vector.
Ask user for position.
Accept new value.
Update using set(index,value) method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter position to update:
2

Enter new value:
99
Output
Updated Vector:
10
20
99
40

*/
import java.util.*;
public class Q07{
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
      
      System.out.println("Enter value to update ");
      int updatedValue = sc.nextInt();
      
      System.out.println("Enter position to update : ");
      int indexPos = sc.nextInt();
      
      v1.set(indexPos , updatedValue);
      
      for(int i = 0 ; i < v1.size() ; i++){
        System.out.print(v1.get(i)+" ");
      }
   }
}
