public class Q14 {
    public static void main(String[] args) {
        int n = 7; 
       
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (n - i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for (int i = 2; i <= n; i++) {
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
       
            for (int k = 1; k <= (n - i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}