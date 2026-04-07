import java.util.*;
public class PR03{
    public static void main(String x[]){
        Collection<String> ls1 = new ArrayList<>();
        
        ls1.add("hello");
        
        for(String l1 : ls1){
           System.out.println(l1+" ");
        }
        
        System.out.println(ls1.size());
    }
}
