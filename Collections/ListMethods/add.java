import java.util.*;
public class add{
 public static void main(String x[]){
  
 Vector<Integer> ls2 = new Vector<>();

 //ls2.add(15);
 //System.out.println(ls2.get(0));

 
 for(int i = 0 ; i <= 11; i++){
    ls2.add(i);
 }
 int size = ls2.size();
 System.out.println(size);
 
 int capacity = ls2.capacity();
 System.out.println(capacity);
 
}
}
