public class Q12 {
    public static void main(String x[]){
        /*
        Q12. Write a java program to print this pattern.

	    #	# 	#	#	#
	    *	*	*	*
	    #	#	#
	    *	*
	    #
        */
    
    for(int i = 5 ; i >= 1 ; i--){
        for(int j = 1 ; j <=i ; j++){
           // System.out.print("* ");
           if(i == 1 || i == 3 || i == 5){
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
