/*
Q9. Write a Java program to copy all elements from one Vector into another Vector.
Description
Create two Vectors.
Store elements in first Vector.
Copy using addAll() method.
Display second Vector.
Input
Enter elements:
5
10
15
20
Output
Second Vector elements:
5
10
15
20
*/
import java.util.*;

public class Q09{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter size of vector : ");
   int size = sc.nextInt();
   
   Vector<Integer> v1 = new Vector<>(size , 2);
   Vector<Integer> v2 = new Vector<>(size , 2);
   System.out.println("Enter elements in vector of "+size);
    for(int i = 0 ; i < size ; i++){
       int data = sc.nextInt();
       v1.add(data);
       v2.add(data);
    }
    System.out.println("Second Vector elements : ");
    for(int i = 0 ; i < size ; i++){
       System.out.print(v1.get(i)+" ");
    }
    
    
   }
}

