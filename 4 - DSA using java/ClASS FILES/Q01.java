import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    /*Example: WAP to check if the array is empty or not ?
    public class CEARRAPP
    */
    int num[] = new int[5];
    System.out.println("Enter elemenets in array :");
        for(int i = 0 ; i < num.length ; i++){
            num[i] = sc.nextInt();
        }
        
        System.out.println();

        for(int i = 0; i < num.length ; i++){
            System.out.println(i+" = "+num[i]);
        }
        
        System.out.println();

        boolean flag = false;

        for(int i = 0 ; i < num.length ; i++){
            if(num[i]!=0){
                flag = true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("not empty");
        }
        else{
            System.out.println("empty");
        }

    }
}
