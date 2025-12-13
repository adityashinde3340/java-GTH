public class Q23 {
    public static void main(String[] args) {
      /*
      Q23. Write a java program to print this pattern.

			*
	      *   *
		*	*	*
	  *   *   *   *
	*	*	*	*	*
      */  

      for(int i = 1 ; i <= 5 ; i++){

        for(int s = 5 ; s >= i; s--){
            System.out.print(" ");
        }

        for(int j = 1 ; j <=  5; j++){
            if(j<=i){
                System.out.print("* ");
            }
        }
        System.out.println();
      }
    }
}
