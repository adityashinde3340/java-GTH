public class Q20 {
    public static void main(String[] args) {
        /*
        Q20. Write a java program to print this pattern.

	    *						*
	    *	*				*	*
	    *		*		*		*
	    *			*			*
	    *		*		*		*
	    *	*				*	*
	    *						*

        */

        for(int i = 1 ; i <= 7 ; i++){
            for(int j = 1 ; j <= 7 ; j++){
               if(j == 1 || j == 7 || j==i || j+i == 8){
                System.out.print("*  ");
               }
               else{
                System.out.print("   ");
               }
            }
            System.out.println();
        }
    }
}
