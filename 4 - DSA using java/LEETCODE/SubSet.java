import java.util.Scanner;

class CheckSubset{

}

public class SubSet{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   int[] parent = new int []{11 , 45 , 78 , 6 , 4 , 78 , 45 , 4};
   int[] arr1 = new int[5];
   boolean res = false;
   System.out.println("Enter elements in array : of size 5 : ");
   for(int i = 0 ; i < arr1.length ; i++){
      arr1[i] = sc.nextInt();
      for(int j = 0 ; j <= parent.length ; j++){
         if(arr1[i] == parent[j]){
            res = true;
         }
         else{
           res = false;
         }
      }
   }
   
   System.out.println(res);
   
   
   }   
}
