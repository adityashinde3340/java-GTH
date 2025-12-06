public class Q21{
	public static void main(String x[]){
	/*
	
	Q21. Write a java program to print this pattern.

	*	*	*	*	*
	*			*	*
	*		*		*
	*	*			*

	
	*/
	
	for(int i = 1 ; i <= 4 ; i++){
		for(int j = 1 ; j <= 5 ; j++){
		if(i == 1){
			System.out.print("* ");
		}
		else if(i == 2){
			if(j == 4){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		else if(i == 3){
			if(j == 3){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}	
		}
		else if(i == 4){
			if(j == 2){
				System.out.println("* ");
				
			}
			else{
				System.out.print("  ");
				
			}
		}
		}	
    System.out.println();		
	}
	}
}