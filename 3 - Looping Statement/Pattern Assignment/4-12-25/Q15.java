public class Q15{
    public static void main(String x[]){
	/*
	
	Q15. Write a java program to print this pattern.

		*	*	*	*	*
		*	#	#	#	*
		*	#	#	#	*
		* 	#	#	#	*
		*	*	*	*	*

	
	*/
    int rows = 5;
	for(int i = 1; i <=5 ; i++){
		for(int j = 1 ; j <= 5; j++){
		if(i > 1 && i < 5){
			if(j > 1 && j < 5){
				System.out.print("# ");
			}
			else{
			System.out.print("* ");
		}
		}
		else{
			System.out.print("* ");
		}
		
		}
		System.out.println();
	}
	}
}