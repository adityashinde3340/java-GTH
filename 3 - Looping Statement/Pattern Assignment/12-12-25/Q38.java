public class Q38{
	public static void main(String x[]){
	/*	
    Q38. Write a java program to print this pattern.
	
	1	*	*	*	*
	2	2	*	*	*
	3	3	3	*	*
	4	4	4	4	*
	5	5	5	5	5
    */
	
	for(int i = 1 ; i <= 5 ; i++){
		for(int j = 1 ; j<= 5; j++){
			if(j<=i){
				if(j == 1){
					System.out.print(1+" ");
				}
				else if(j == 2){
					System.out.print(2+" ");
				}
				else if(j == 3){
					System.out.print(3+" ");
				}
				else if(j == 4){
					System.out.print(4+" ");
				}
				else if(j == 5){
					System.out.print(5+" ");
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