//import java.util.Scanner;
import java.util.*;
public class PR04{

   public static void main(String x[]){
     Scanner sc = new Scanner(System.in);
     List<Integer> li = new ArrayList<>();
     System.out.println("Enter size : ");
     int size = sc.nextInt();
     System.out.println("Enter elements : ");
     for(int i = 0 ; i < size; i++){
        int inp = sc.nextInt();
        li.add(inp);
     }
     
      for(int ls1 : li){
        System.out.print(ls1+" ");
     }
     
     
   }

}
