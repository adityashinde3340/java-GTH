public class Q45{
	public static void main(String x[]){
	/*
	
	Q45. Write a java program to print this pattern.

	1
	2	3
	4		5
	6			7
	8	9	10	11	12

	
	*/
	 int c = 1;

        for (int i = 1; i <= 5; i++) {

            if (i < 5) {
                // print first number
                System.out.print(c);
                c++;

                // print spaces (increasing each row)
                for (int s = 1; s <= (i - 1) * 4; s++) {
                    System.out.print(" ");
                }

                // print second number
                System.out.print(c);
                c++;

            } else {
                // last row → print 5 numbers continuously
                for (int j = 1; j <= 5; j++) {
                    System.out.print(c + " ");
                    c++;
                }
            }

            System.out.println();
        }
	}	
}