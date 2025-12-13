public class Q19 {
    public static void main(String[] args) {
        /*
        Q19. Write a java program to print this pattern.

	    *	*	*	*	*	*	
          *   *	  *   *   *        
		    *	*	*	*
		      *   *   *
			    *   *
			      *
        */
         
      


        for(int i = 1 ; i <= 6 ; i++){


            for(int s = 1 ; s<i ; s++){
                System.out.print(" -");
            }
            for(int j = 1 ; j <= 6 ; j++){
                //System.out.print("* ");
                if(j>=i){
                    System.out.print("*   ");
                }  
            }
            System.out.println();
        }
    }
}
