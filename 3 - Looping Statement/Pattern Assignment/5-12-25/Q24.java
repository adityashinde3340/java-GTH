public class Q24{
	public static void main(String x[]){
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
    
	for(int i = 1 ; i <= 5 ; i++){
	   for(int j = 1 ; j <= i; j++){
		   System.out.print("* ");
	   }
	   System.out.println();
	}
	for(int i1 = 5 ; i1 >= 1 ; i1++){
	   for(int j1 = 5; j1 <= i1 ; j1--){
		   System.out.print("* ");
	   }
       System.out.println();	   
	}
	}
}