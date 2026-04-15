import java.util.*;
public class set{
   public static void main(String x[]){
       List<Integer> LS1 = new Vector<>();
       LS1.add(10);
       LS1.add(2);
       
       System.out.println(LS1.get(1));
       LS1.set(1 , 20);
       System.out.println(LS1.get(1));
   }
}
