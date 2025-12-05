//Q20. Write a java program to swap first and last digits of a number
import java.util.Scanner;

public class Q20DW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
		int last = temp % 10;
		
		int count = 0;
		do{
			temp = temp / 10;
		    count++;
	  	}
		while(temp>0);
		
		int place = 1;
		int j = 1;
		do{
			place = place * 10;
		    j++;
		
		}
		while(j<count);
		
		int first = num / place;
		int middle = (num % place) / 10;
		
		int swapped = last * 1000 + middle * 10 + first;
	
		System.out.println("first = "+first);
		System.out.println("last ="+last);
		System.out.println(swapped);
		
		
    }
}
