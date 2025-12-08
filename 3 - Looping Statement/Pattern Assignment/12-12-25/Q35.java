public class Q35{
	public static void main(String x[]){
	/*	
Q35. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
    */
	
	for(int i = 1 ; i >= 5; i++){
		//System.out.print(i+" ");
		for(int j = 1 ; j <= 5;j++){
			if(j<i){
				System.out.print("\t");
			}
			else{
				System.out.print((5-j) + "\t");
			}
		}
		System.out.println();
	}
	
	}
}