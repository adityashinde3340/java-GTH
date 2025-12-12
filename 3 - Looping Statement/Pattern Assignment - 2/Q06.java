public class Q06 {
    public static void main(String[] args) {
        /*
        Q6. Write a java program to print this pattern.

    	        *
              *	*
            * *	*
          * * *	*
        * * * * *

        */
        int rows = 5;
        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = 1 ; j <= rows ; j++){
                if(j <= rows - i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();

        }


    }
}
