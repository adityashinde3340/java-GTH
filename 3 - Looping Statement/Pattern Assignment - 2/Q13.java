public class Q13 {
    public static void main(String[] args) {
        /* 
        Q13. Write a java program to print this pattern.

        *	*	*	*	*
        *	*	*	*	#
        *  	*	*	#	#
        *  	*	#	#	#
        *	#	#	#	#

        */

        for(int i = 1 ; i <= 5; i++){
            for(int j = 5 ; j >= 1 ; j--){
                //System.out.print("* ");
                if(j<i){
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
