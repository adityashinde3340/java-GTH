public class Q25 {
    public static void main(String[] args) {

        /*
        Q25. Write a java program to print this pattern.

	    *	*	*	*	*	*	*	*	*
	    *	*	*	*		*	*	*	*
	    *	*	*				*	*	*
	    *	*						*	*
	    *								*
	    *	*						*	*
	    *	*	*				*	*	*
	    *	*	*	*		*	*	*	*
	    *	*	*	*	*	*	*	*	*
        */

        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= 9 ; j++){
                if(i == 1 ||
                   i == 9 ||
                   j == 1 ||
                   j == 9 ||
                   i == j ||
                   i+j==10){
                System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
