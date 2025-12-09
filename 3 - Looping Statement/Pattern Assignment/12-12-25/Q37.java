public class Q37 {
    public static void main(String[] args) {
        int n = 9;
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
   
            for (int j = 1; j <= n - 2 * i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}