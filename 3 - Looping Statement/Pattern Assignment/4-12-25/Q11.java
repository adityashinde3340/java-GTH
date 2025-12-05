public class Q11 {
    public static void main(String[] args) {

        int rows = 5;

       
        for (int i = 1; i <= 4; i++) {

            System.out.print("*");  

            if (i > 1) {
                for (int s = 1; s <= i - 1; s++) {
                    System.out.print("\t"); 
                }
                System.out.print("*");  
            }

            System.out.println();
        }

      
        for (int i = 1; i <= 5; i++) {
            System.out.print("*\t");
        }
    }
}
