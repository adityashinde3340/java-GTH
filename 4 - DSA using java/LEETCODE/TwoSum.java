import java.util.Scanner;
public class TwoSum{
  
   public static void main(String x[]){
   //target => 9
    Scanner sc = new Scanner(System.in);
   
 
   
   int target = 9 , count = 0;;
   
   System.out.println("Enter size of the array : ");
   int size = sc.nextInt();
   int[] arr = new int[size];
   System.out.println("Enter a elements in array : ");
   for(int i = 0 ; i < arr.length ; i++){
      arr[i] = sc.nextInt();
   }
    
   for(int i = 0 ; i < arr.length ; i++){
       for(int j = i ; j < arr.length ; j++){
          if(arr[i] + arr[j] == target)
          {
          count++;
          }
       }
     
   }
   System.out.println("target = "+count);
   }
}
