import java.util.Scanner;
public class ARR {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int arr[] = new int[8];
    System.out.println("Enter elemenets in array : ");
      for(int i = 0 ; i < arr.length ; i++){
      arr[i] = sc.nextInt();
      }

      for(int i = 0 ; i<arr.length ; i++){
       System.out.println(i+"-->"+arr[i]);
      }
    }
}
