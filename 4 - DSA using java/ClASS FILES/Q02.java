import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*

        Example: WAP to create an array of size 6 and store  5 values in it at initial level  and store value on specified index in array and move index by 1.

        */
        System.out.println("Enter elements in array : ");
        int arr[] = new int[6];
            for(int i = 0 ; i < (arr.length -1) ; i++){
            arr[i] = sc.nextInt();
            } 
        
        System.out.println("enter value : ");
        int  value = sc.nextInt();
        System.out.println("enter position : ");
        int position = sc.nextInt();

        
    }
    
}