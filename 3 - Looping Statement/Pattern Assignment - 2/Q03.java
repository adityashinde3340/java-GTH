public class Q03 {
    public static void main(String[] args) {
        /*
        Q3. Write a java program to print this pattern.

	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*

        */
        int rows = 5;
        for(int i = 1 ; i <= rows; i++){
            for(int j = 1 ; j <= rows; j++){
                if(j == 1 || j == 3 || j == 5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
