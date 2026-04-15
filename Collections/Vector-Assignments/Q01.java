/*
1.Write a Java program to store 5 integer elements in a Vector and display all elements.
Description
Create a Vector of Integer type.
Accept 5 numbers from user.
Store them using add() method.
Display elements using loop.
Input
Enter 5 numbers:
10
20
30
40
50
Output
Vector elements are:
10
20
30
40
50

*/
import java.util.*;
public class Q01{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   Vector<Integer> V = new Vector<>();
   System.out.println("Enter 5 elements in Vector : ");
   for(int i = 0; i < 5 ; i++){
       int inp = sc.nextInt();
       V.add(inp);
   }
   
   for(int i = 0 ; i < 5 ; i++){
      System.out.print(V.get(i)+" ");
   }
   
   
   }
}
