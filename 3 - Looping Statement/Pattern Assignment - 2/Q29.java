public class Q29 {
    public static void main(String[] args) {
        /*
        Q29. Write a java program to print this pattern.

	    #	*	*	*	#
	    *	#	*	#	*
	    *	*	#	*	*
	    *	#	*	#	*
	    #	*	*	*	#
        */

        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
               if(j == i || j+i == 6 || i+j == 6 ||i==j){
                System.out.print("# ");
               }
               else{
                System.out.print("* ");
               }
            }
            System.out.println();
        }
    }
}
