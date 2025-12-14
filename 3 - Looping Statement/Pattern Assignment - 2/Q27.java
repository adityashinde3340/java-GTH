public class Q27 {
    public static void main(String[] args) {
        /*
        Q27. Write a java program to print this pattern.

	    *
	    *	*
	    *	*	*
	    *
	    *	*
	    *	*	*
        */

        for(int i = 1 ; i <= 3 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int s = 1 ; s <= 3 ; s++){
            for(int h = 1 ; h <= s ; h++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
