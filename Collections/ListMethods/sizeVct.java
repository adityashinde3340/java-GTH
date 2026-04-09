import java.util.*;
public class sizeVct
{ public static void main(String x[])
   {    Vector<Integer> v = new Vector<>(3,2);
	   int capacity=v.capacity();
	   System.out.println("Capacity of Vector is "+capacity);
	   v.add(10);
	  
	   System.out.println("The size of vector is "+v.size());
	   System.out.println("increased capacity "+v.capacity());
   }
}

