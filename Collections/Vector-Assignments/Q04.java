/*
Q4. Write a Java program to remove a specific element from a Vector.
Description
Store elements in Vector.
Take element to remove.
Use remove() method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter element to remove:
30
Output
Updated Vector:
10
20
40

*/
import java.util.*;
public class Q04
{
    public static void main(String x[])
	{
	    Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of vector : ");
      int size = sc.nextInt();
      
      Vector<Integer> v1 = new Vector<>(size , 2);
      System.out.println("Enter data in vector of size "+size+" : ");
      for(int i = 0 ; i < size;i++){
        int data = sc.nextInt();
        v1.add(data);
      }
     
     System.out.println("Enter element to remove : ");
     int remElement = sc.nextInt();
      
     v1.remove(v1.indexOf(remElement));
     
    for(int i = 0 ; i < v1.size();i++){
       System.out.print(v1.get(i)+" ");
    }
    
     
	}
}

