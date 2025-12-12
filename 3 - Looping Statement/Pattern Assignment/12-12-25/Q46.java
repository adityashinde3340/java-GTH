public class Q46{
	public static void main(String x[]){
	/*	
					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1
    */
	
	for (int i = 1; i <= 5; i++) {

            
            for (int t = 0; t < 5 - i; t++) {
                System.out.print("\t");
            }

            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i);
                for (int t = 0; t < 2 * i - 3; t++) {
                    System.out.print("\t");
                }
                System.out.print(i+" ");
            }

            System.out.println();
        }

       
        for (int i = 4; i >= 1; i--) {

          
            for (int t = 0; t < 5 - i; t++) {
                System.out.print("\t");
            }

            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i);
                for (int t = 0; t < 2 * i - 3; t++) {
                    System.out.print("\t");
                }
                System.out.print(i);
            }

            System.out.println();
        }
	
	}
}