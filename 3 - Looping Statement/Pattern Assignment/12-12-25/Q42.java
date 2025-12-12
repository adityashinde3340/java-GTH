public class Q42{
	public static void main(String x[]){
	/*Q42. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1   */
	int c = 1;
	int h = 1;
	for(int i = 1 ; i <= 5 ; i++){
		
		for(int j = 1 ; j <= 5; j++){
			System.out.print(c + " ");
			//i++;
			c++;
			if(c > 9){
				c = h ;
			}
		}
	    System.out.println();
	}
	
	}
}