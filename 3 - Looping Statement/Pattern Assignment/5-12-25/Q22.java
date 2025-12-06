public class Q22{
	public static void main(String x[]){
	//Q22. Write a java program to print this pattern.

    /*
	
	*	*	*	*	*
	  *	     	  *
		*       *
		  *   *
			* 
	*/		
    
	
        int rows = 7;
        int cols = 20;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

           
                if (i == 0 && (j == 1 || j == 4 || j == 7 || j == 10 || j == 13)) {
                    System.out.print("* ");
                }

               
                else if (j == 0 && i > 0) {
                    System.out.print("  ");
                }

                
                else if (j == 3 && i > 0) {
                    System.out.print("  ");
                }

               
                else if ((i == 2 && j == 6) ||
                         (i == 2 && j == 11) ||
                         (i == 3 && j == 8)  ||
                         (i == 3 && j == 9)  ||
                         (i == 4 && j == 7)  ||
                         (i == 4 && j == 10) ||
                         (i == 5 && j == 8)) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

	
