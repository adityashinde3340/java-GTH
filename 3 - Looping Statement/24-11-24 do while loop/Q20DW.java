//Q20. Write a java program to swap first and last digits of a number
import java.util.Scanner;

public class Q20DW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int last = temp % 10;   

        int first = 0;
        int count = 0;

        // find first digit and count digits
		int j = 0;
        do{
            first = temp % 10;    
            temp = temp / 10;
            count++;
			j++;
        }while (j > num);

       
        if (count == 1) {
            System.out.println("Swapped number: " + num);
            return;
        }

       
        int place = 1;
		int i = 1;
		do{
			place = place * 10;
		}
        while(i <= count);		
        //for (int i = 1; i <= count - 1; i++) {
        //    place = place * 10;
        //}

       
        int middle = num % place;
      
        middle = middle / 10;

      
        int swapped = last * place + middle * 10 + first;

        System.out.println("Swapped number: " + swapped);
    }
}
