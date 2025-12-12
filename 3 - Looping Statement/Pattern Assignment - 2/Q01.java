import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
      /*  
      Q1. Write a java program to print this pattern.
	
    	*	*	*	*	*
	    *	*	*	*	*
	    *	*	*	*	*
	    *	*	*	*	*
	    *	*	*	*	*
      */

      for(int i = 1 ; i <= 3 ; i++){
        for(int j = 1 ; j <= 5 ; j++){
          System.out.print("* ");  
        }
        System.out.println();
      }
    }
}