public class Q24 {
    public static void main(String[] args) {
        /*
        Q24. Write a java program to print this pattern.

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	

        */
    
    for(int i = 1 ; i <= 5; i++){
        for(int j = 1 ; j <= i ; j++){
            if(j == 1 || j == 3 || j == 5){
                System.out.print("# ");
            }
            else{
                System.out.print("* ");
            }
            
        }
         System.out.println();
        
    }
    //outer
    for(int k = 1 ; k <= 5 ; k++){
       for(int s = 4 ; s >= k; s--){
        if(s == 1 || s == 3 || s == 5){
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
