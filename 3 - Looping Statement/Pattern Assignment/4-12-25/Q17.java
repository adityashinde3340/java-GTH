public class Q17{
	public static void main(String x[]){
	/*
	Q17. Write a java program to print this pattern.

	*	*	*	*	*
	*			*
	*		*
	*	*
	*
    */
	
	for(int i = 1 ; i <= 5 ; i++){
		System.out.print("* ");
	}
	System.out.println();
	for(int i1 = 1 ; i1 <= 5;i1++){
		if(i1 == 1 || i1 == 4){
			System.out.print("* ");
		}
		else{
			System.out.print("  ");
		}
	}
	System.out.println();
	for(int i2 = 1 ; i2 <= 5; i2++){
		if(i2 == 1 || i2 == 3){
			System.out.print("* ");
		}
		else{
			System.out.print("  ");
		}
	}
	System.out.println();
	
	for(int i3 = 1 ; i3 <= 5; i3++){
		if(i3 == 1 || i3 == 2){
			System.out.print("* ");
		}
		else{
			System.out.print("  ");
		}
	}
	
	System.out.println();
	
	for(int i4 = 1 ; i4 <= 5; i4++){
		if(i4 == 1 || i4 == 1){
			System.out.print("* ");
		}
		else{
			System.out.print("  ");
		}
	}
	}
}