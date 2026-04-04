
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        //Q10. Write a java program to count the number of digits in a number.
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a number : ");

    int num = sc.nextInt();
    int count = 0 , temp = num , num_count = 0; 

    while(temp!=0){
        temp = temp / 10;
        num_count+=1;
    }
    
    System.out.println("digits = "+num_count);

    }
}
