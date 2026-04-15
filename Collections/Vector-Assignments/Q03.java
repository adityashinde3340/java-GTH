/* Q3. Write a Java program to search a given number in a Vector.
Description
Store integer values in Vector.
Accept a number to search.
Check using loop or contains() method.
Print found or not found.
Input
Enter number of elements:
5

Enter elements:
10
22
35
48
50

Enter number to search:
35
Output
Element found in vector
*/

import java.util.*;

public class Q03{
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
      
      System.out.println("Enter data element to find : ");
      int findEle = sc.nextInt();
      boolean flag =false;
      for(int i = 0 ; i < size;i++){
         if(findEle == v1.get(i)){
           flag = true;
           break;
           //System.out.println("element "+findEle+" is at "+v1.indexOf(findEle));
         }
      
      }
      if(flag){
        System.out.println("element "+findEle+" is at "+v1.indexOf(findEle));
      }
      else{
        System.out.println("not found !");
      }
   }
}
