public class Q15 {
    public static void main(String[] args) {
    /*
    Q15. Write a java program to print this pattern.

		*	*	*	*	*
		*	#	#	#	*
		*	#	#	#	*
		* 	#	#	#	*
		*	*	*	*	*

    */
       for(int i = 1 ; i <= 5 ; i++){
           for(int j = 1 ; j <=5 ; j++){
            //System.out.print("* ");
            if((i!=1 && i!=5) && (j == 2 || j == 3 ||j == 4)){
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
