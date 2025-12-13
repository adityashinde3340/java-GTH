public class Q22 {
    public static void main(String[] args) {
        /*
        Q22. Write a java program to print this pattern.

	    *	*	*	*	*
	      *	     	  *
		    *       *
		      *   *
			    *  
        */
        int n = 5;
        for(int i = 1 ; i <= n; i++){
 
            for(int h = 1 ; h < i ; h++){
                System.out.print(" ");
            }


            for(int j = 1 ; j <= n ; j++){
                if(i == 1 || j == 1 || j+i== 6){
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
