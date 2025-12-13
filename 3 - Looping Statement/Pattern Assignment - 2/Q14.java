public class Q14 {
    public static void main(String[] args) {
        /*
        Q14. Write a java program to print this pattern.

			 * * * * * * *
			 * * * * * *
 			 * * * * *
 			 * * * *
 			 * * *
 			 * *
 			 *
 			 * *
 			 * * *
 			 * * * *
 			 * * * * *
 			 * * * * * *
 			 * * * * * * *

        */
        for(int i = 1 ; i <= 7 ; i++){
             for(int j = 7 ; j >= i; j--){
                    System.out.print("* ");
             }
             System.out.println();    
        } 

        for(int s = 2 ; s <= 7;s++){
             for(int h = 1 ; h <= s; h++){
                System.out.print("* ");
             }
             System.out.println();
        }    
    }
}
